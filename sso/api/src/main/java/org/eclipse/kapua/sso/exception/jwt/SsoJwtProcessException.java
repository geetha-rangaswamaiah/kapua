/*******************************************************************************
 * Copyright (c) 2019, 2020 Eurotech and/or its affiliates and others
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
package org.eclipse.kapua.sso.exception.jwt;

import org.eclipse.kapua.sso.exception.SsoErrorCodes;

public class SsoJwtProcessException extends SsoJwtException {

    /**
     * Constructor.
     *
     * @param cause     The original {@link Throwable}.
     * @param arguments The arguments associated with the {@link Exception}.
     */
    public SsoJwtProcessException(Throwable cause, Object... arguments) {
        super(SsoErrorCodes.JWT_PROCESS_ERROR, cause, arguments);
    }
}
