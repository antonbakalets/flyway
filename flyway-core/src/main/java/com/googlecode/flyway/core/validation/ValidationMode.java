/**
 * Copyright (C) 2010-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.googlecode.flyway.core.validation;

/**
 * Mode for the validation.
 *
 * @deprecated Use Flyway.validateOnMigrate instead. Will be removed in Flyway 3.0.
 */
@Deprecated
public enum ValidationMode {
    /**
     * Do not validate anything.
     */
    NONE,

    /**
     * Validate all applied migrations against the migrations present on the classpath.
     */
    ALL
}