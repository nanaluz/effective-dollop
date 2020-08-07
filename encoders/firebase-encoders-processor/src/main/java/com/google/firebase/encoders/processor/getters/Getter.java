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

package com.google.firebase.encoders.processor.getters;

import com.google.auto.value.AutoValue;
import javax.lang.model.type.ArrayType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;

@AutoValue
public abstract class Getter {
  /** Encoded name of the getter. */
  public abstract String name();

  /**
   * Java expression to get the getter's value
   *
   * <p>Usually is of the form: getFoo()
   */
  public abstract String expression();

  abstract TypeMirror returnType();

  /**
   * Getter's underlying Java type.
   *
   * <p>The type is fully resolved with respect to generics, i.e. {@code Optional<MyType<String>>},
   * not {@code Optional<T>}.
   */
  public TypeMirror getUnderlyingType() {
    if (returnType().getKind() != TypeKind.ARRAY) {
      return returnType();
    }
    return ((ArrayType) returnType()).getComponentType();
  }

  public static Getter create(String name, String expression, TypeMirror returnType) {
    return new AutoValue_Getter(name, expression, returnType);
  }
}
