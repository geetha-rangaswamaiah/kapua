/*******************************************************************************
 * Copyright (c) 2017, 2020 Red Hat Inc and others.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Red Hat Inc - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.plugin.sso.openid;

import org.eclipse.kapua.plugin.sso.openid.exception.OpenIDAccessTokenException;
import org.eclipse.kapua.plugin.sso.openid.exception.uri.OpenIDUriException;

import javax.json.JsonObject;
import java.net.URI;

/**
 * OpenID Connect Single Sign On service interface.
 */
public interface OpenIDService {

    /**
     * Check if the service is enabled.
     *
     * @return <tt>true</tt> if the service is enabled, <tt>false</tt> otherwise.
     */
    boolean isEnabled();

    /**
     * Get the login URI.
     *
     * @param state the state parameter used by OpenID to maintain state between the request and the callback.
     * @param redirectUri a URI object representing the redirect URI.
     * @return the login URI in the form of a String.
     * @throws OpenIDUriException if it fails to retrieve the login URI.
     */
    String getLoginUri(String state, URI redirectUri) throws OpenIDUriException;

    /**
     * Get the access token.
     *
     * @param authCode the authorization code from the HttpServletRequest.
     * @param redirectUri a URI object representing the redirect URI.
     * @return the access token in the form of a {@link JsonObject}.
     * @throws OpenIDAccessTokenException if it fails to retrieve the access token.
     */
    JsonObject getAccessToken(String authCode, URI redirectUri) throws OpenIDAccessTokenException;

    /**
     * Get the Relying-Party-Initiated logout.
     * This must be implemented following https://openid.net/specs/openid-connect-session-1_0.html#RPLogout
     *
     * @param idTokenHint the ID Token representing the identity of the user that is requesting to log out.
     * @param postLogoutRedirectUri a URI object representing the destination where the user is redirected after the
     *                              logout.
     * @param state the state parameter used by OpenID to maintain state between the logout request and the callback
     *              to the {@code postLogoutRedirectUris} endpoint.
     * @return the logout URI in the form of a String.
     * @throws OpenIDUriException if it fails to retrieve the logout URI.
     */
    String getLogoutUri(String idTokenHint, URI postLogoutRedirectUri, String state) throws OpenIDUriException;
}
