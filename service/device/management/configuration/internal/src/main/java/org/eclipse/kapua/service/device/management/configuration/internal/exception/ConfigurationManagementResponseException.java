/*******************************************************************************
 * Copyright (c) 2018, 2020 Eurotech and/or its affiliates and others
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
package org.eclipse.kapua.service.device.management.configuration.internal.exception;

import org.eclipse.kapua.service.device.management.exception.DeviceManagementResponseException;
import org.eclipse.kapua.service.device.management.message.response.KapuaResponseCode;

public class ConfigurationManagementResponseException extends DeviceManagementResponseException {

    private static final long serialVersionUID = 1540849582889208592L;

    public ConfigurationManagementResponseException(ConfigurationManagementResponseErrorCodes code, KapuaResponseCode responseCode, String exceptionMessage, String exceptionStack,
                                                    Object... arguments) {
        super(code, responseCode, exceptionMessage, exceptionStack, arguments);
    }
}
