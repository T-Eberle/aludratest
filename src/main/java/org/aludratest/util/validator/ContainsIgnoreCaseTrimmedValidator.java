/*
 * Copyright (C) 2010-2014 Hamburg Sud and the contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.aludratest.util.validator;

import java.util.Locale;

/**
 * Requires strings to contain a sub string ignoring capitalization.
 * @author Volker Bergmann
 */
public class ContainsIgnoreCaseTrimmedValidator extends AbstractNullStringValidator {

    /** Constructor.
     *  @param expectedSubString the required sub string */
    public ContainsIgnoreCaseTrimmedValidator(String expectedSubString) {
        super(expectedSubString);
    }

    @Override
    protected boolean validImpl(String text) {
        return text.toLowerCase(Locale.US).contains(validationTerm.trim().toLowerCase(Locale.US));
    }

    @Override
    protected String descriptionImpl() {
        return "expecting the trimmed sub string '" + validationTerm + "' ignoring case";
    }

}
