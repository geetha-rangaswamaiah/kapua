/*******************************************************************************
 * Copyright (c) 2017, 2020 Eurotech and/or its affiliates and others
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.app.console.module.job.shared.model;

import org.eclipse.kapua.app.console.module.api.shared.model.KapuaBaseModel;

public class GwtJobStepProperty extends KapuaBaseModel {

    public String getPropertyName() {
        return get("propertyName");
    }

    public void setPropertyName(String propertyName) {
        set("propertyName", propertyName);
    }

    public String getPropertyType() {
        return get("propertyType");
    }

    public void setPropertyType(String propertyType) {
        set("propertyType", propertyType);
    }

    public String getPropertyValue() {
        return get("propertyValue");
    }

    public void setPropertyValue(String propertyValue) {
        set("propertyValue", propertyValue, false);
    }

    public String getExampleValue() {
        return get("exampleValue");
    }

    public void setExampleValue(String exampleValue) {
        set("exampleValue", exampleValue);
    }

    public boolean isEnum() {
        return get("isEnum");
    }

    public void setEnum(boolean isEnum) {
        set("isEnum", isEnum);
    }

}
