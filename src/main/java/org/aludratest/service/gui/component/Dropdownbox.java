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
package org.aludratest.service.gui.component;

import org.aludratest.service.locator.option.IndexLocator;
import org.aludratest.service.locator.option.LabelLocator;
import org.aludratest.service.locator.option.OptionLocator;
import org.databene.commons.Validator;

/** Represents a dropdownbox in a GUI.
 * @author Joerg Langnickel
 * @author Volker Bergmann */
public interface Dropdownbox extends InputComponent<Dropdownbox> {

    /** Selects an entry of this Dropdownbox by its label. If the label is <code>null</code> or marked as null, the operation is
     * not executed. It the label is marked as empty, it will be replaced with "".
     * 
     * @param label Label of the entry to select. */
    public void selectEntry(String label);

    /** Selects an entry of a Dropdownbox by its locator, which must be either a {@link LabelLocator} or an {@link IndexLocator}.
     * 
     * @param optionLocator is a LabelLocator or IndexLocator for identifying the entry to select. If <code>null</code>, no action
     *            is performed. */
    public void selectEntry(OptionLocator optionLocator);

    /** Reads the selected value and returns it as a String.
     * 
     * @return the <b>value</b> of the selected entry */
    public String getSelectedEntry();

    /** Reads the selected label and returns it as a String.
     * 
     * @return the <b>label</b> of the selected entry */
    public String getSelectedLabel();

    /** Verifies that the passed label is selected in this Dropdownbox. If the label is null or marked as null the operation is not
     * executed. If the label is marked as empty it will be replaced with ""
     * 
     * @param label Label to check the currently selected label against. */
    public void assertIsSelected(String label);

    /** Verifies that the passed label is <b>not</b> selected in this Dropdownbox. If the label is null or marked as null the
     * operation is not executed. If the label is marked as empty it will be replaced with ""
     * 
     * @param label Label to check the currently selected label against. */
    public void assertTextNotEquals(String label);

    /** Verifies that the passed text is part of the currently selected label in this Dropdownbox. If the label is null or marked
     * as null the operation is not executed.
     * 
     * @param label Label to check the currently selected label against. */
    public void assertSelectedContains(String label);

    /** Verifies that the passed label is selected in this Dropdownbox. If the label is null or marked as null the operation is not
     * executed. If the label is marked as empty it will be replaced with "". Differences in case, leading or trailing whitespace
     * are ignored.
     * 
     * @param label Label to check the currently selected label against. */
    public void assertSelectedIgnoreCaseTrimmed(String label);

    /** Asserts that the selection matches the provided {@link Validator}.
     * @param validator the validator to apply for verification */
    public void assertSelectionMatches(Validator<String> validator);

    /** Verifies that this Dropdownbox has the passed through values (and only these). If only one value is passed and it is
     * <code>null</code> or marked as <code>null</code>, the operation will not be executed.
     * 
     * @param values Values to check the values of this Dropdownbox against. */
    public void assertHasValues(String... values);

    /** Checks if this Dropdownbox has the expected labels.
     * 
     * The check fails if:
     * <ul>
     * <li>order of the Labels is wrong</li>
     * <li>not every Label is mentioned</li>
     * <li>a wrong Label is mentioned</li>
     * </ul>
     * If only one label is passed and it is <code>null</code> or marked as <code>null</code>, the operation will not be executed.
     * @param labels which should be checked */
    public void assertHasLabels(String... labels);

    /** Verifies that this Dropdownbox has the given labels (and possibly more than these). If only one value is passed and it is
     * <code>null</code> or marked as <code>null</code>, the operation will not be executed.
     * 
     * @param labels Labels to check the labels of this Dropdownbox against. */
    public void assertContainsLabels(String... labels);

    /** Checks if this Dropdownbox has the given labels (and possibly more than these).
     * 
     * @param labels Labels to check the labels of this Dropdownbox against.
     * 
     * @return <code>true</code> if the checkbox contains the given labels, <code>false</code> otherwise. */
    public boolean checkContainsLabels(String... labels);

    /** Checks if this Dropdownbox has ONLY the given labels - in the order as speficied.
     * 
     * @param labels Labels to check the labels of this Dropdownbox against.
     * 
     * @return <code>true</code> if the checkbox only contains the given labels, <code>false</code> otherwise. */
    public boolean checkEqualsLabels(String... labels);

}
