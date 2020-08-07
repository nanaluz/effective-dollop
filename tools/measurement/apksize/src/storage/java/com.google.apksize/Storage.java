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

package com.google.apksize;

import android.content.Context;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import java.io.File;

public class Storage implements SampleCode {

  @Override
  public void runSample(Context context) {

    String mBucketName =
        "gs://" + context.getString(R.string.google_project_id) + ".storage.firebase.com";
    StorageReference mStorageRef = FirebaseStorage.getInstance().getReference(mBucketName);
    mStorageRef.getFile(new File(""));
  }
}
