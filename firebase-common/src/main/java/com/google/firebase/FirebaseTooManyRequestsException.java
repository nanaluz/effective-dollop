// Copyright 2018 Google LLC
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

package com.google.firebase;

import androidx.annotation.NonNull;

/**
 * Exception thrown when a request to a Firebase service has been blocked due to having received too
 * many consecutive requests from the same device. Retry the request later to resolve.
 */
public class FirebaseTooManyRequestsException extends FirebaseException {

  public FirebaseTooManyRequestsException(@NonNull String message) {
    super(message);
  }
}
