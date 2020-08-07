// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import java.util.List;

@AutoValue
public abstract class BatchedLogRequest {
  @NonNull
  public abstract List<LogRequest> getLogRequests();

  @NonNull
  public static BatchedLogRequest create(@NonNull List<LogRequest> logRequests) {
    return new AutoValue_BatchedLogRequest(logRequests);
  }
}
