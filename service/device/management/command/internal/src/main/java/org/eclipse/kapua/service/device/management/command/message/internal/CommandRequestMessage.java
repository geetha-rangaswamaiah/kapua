/*******************************************************************************
 * Copyright (c) 2016, 2020 Eurotech and/or its affiliates and others
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *     Red Hat Inc
 *******************************************************************************/
package org.eclipse.kapua.service.device.management.command.message.internal;

import org.eclipse.kapua.message.internal.KapuaMessageImpl;
import org.eclipse.kapua.service.device.management.message.request.KapuaRequestMessage;

/**
 * Device command request message.
 */
public class CommandRequestMessage extends KapuaMessageImpl<CommandRequestChannel, CommandRequestPayload> implements KapuaRequestMessage<CommandRequestChannel, CommandRequestPayload> {

    private static final long serialVersionUID = 1L;

    @SuppressWarnings("unchecked")
    @Override
    public Class<CommandRequestMessage> getRequestClass() {
        return CommandRequestMessage.class;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Class<CommandResponseMessage> getResponseClass() {
        return CommandResponseMessage.class;
    }

}
