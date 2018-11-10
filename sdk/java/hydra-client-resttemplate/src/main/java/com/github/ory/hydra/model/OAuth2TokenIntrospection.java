/*
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * OpenAPI spec version: latest
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.ory.hydra.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://tools.ietf.org/html/rfc7662
 */
@ApiModel(description = "https://tools.ietf.org/html/rfc7662")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-10T18:32:35.710+01:00")
public class OAuth2TokenIntrospection {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("aud")
  private List<String> aud = null;

  @JsonProperty("client_id")
  private String clientId = null;

  @JsonProperty("exp")
  private Long exp = null;

  @JsonProperty("ext")
  private Map<String, Object> ext = null;

  @JsonProperty("iat")
  private Long iat = null;

  @JsonProperty("iss")
  private String iss = null;

  @JsonProperty("nbf")
  private Long nbf = null;

  @JsonProperty("obfuscated_subject")
  private String obfuscatedSubject = null;

  @JsonProperty("scope")
  private String scope = null;

  @JsonProperty("sub")
  private String sub = null;

  @JsonProperty("token_type")
  private String tokenType = null;

  @JsonProperty("username")
  private String username = null;

  public OAuth2TokenIntrospection active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Active is a boolean indicator of whether or not the presented token is currently active.  The specifics of a token&#39;s \&quot;active\&quot; state will vary depending on the implementation of the authorization server and the information it keeps about its tokens, but a \&quot;true\&quot; value return for the \&quot;active\&quot; property will generally indicate that a given token has been issued by this authorization server, has not been revoked by the resource owner, and is within its given time window of validity (e.g., after its issuance time and before its expiration time).
   * @return active
  **/
  @ApiModelProperty(required = true, value = "Active is a boolean indicator of whether or not the presented token is currently active.  The specifics of a token's \"active\" state will vary depending on the implementation of the authorization server and the information it keeps about its tokens, but a \"true\" value return for the \"active\" property will generally indicate that a given token has been issued by this authorization server, has not been revoked by the resource owner, and is within its given time window of validity (e.g., after its issuance time and before its expiration time).")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public OAuth2TokenIntrospection aud(List<String> aud) {
    this.aud = aud;
    return this;
  }

  public OAuth2TokenIntrospection addAudItem(String audItem) {
    if (this.aud == null) {
      this.aud = new ArrayList<String>();
    }
    this.aud.add(audItem);
    return this;
  }

   /**
   * Audience contains a list of the token&#39;s intended audiences.
   * @return aud
  **/
  @ApiModelProperty(value = "Audience contains a list of the token's intended audiences.")
  public List<String> getAud() {
    return aud;
  }

  public void setAud(List<String> aud) {
    this.aud = aud;
  }

  public OAuth2TokenIntrospection clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * ClientID is aclient identifier for the OAuth 2.0 client that requested this token.
   * @return clientId
  **/
  @ApiModelProperty(value = "ClientID is aclient identifier for the OAuth 2.0 client that requested this token.")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public OAuth2TokenIntrospection exp(Long exp) {
    this.exp = exp;
    return this;
  }

   /**
   * Expires at is an integer timestamp, measured in the number of seconds since January 1 1970 UTC, indicating when this token will expire.
   * @return exp
  **/
  @ApiModelProperty(value = "Expires at is an integer timestamp, measured in the number of seconds since January 1 1970 UTC, indicating when this token will expire.")
  public Long getExp() {
    return exp;
  }

  public void setExp(Long exp) {
    this.exp = exp;
  }

  public OAuth2TokenIntrospection ext(Map<String, Object> ext) {
    this.ext = ext;
    return this;
  }

  public OAuth2TokenIntrospection putExtItem(String key, Object extItem) {
    if (this.ext == null) {
      this.ext = new HashMap<String, Object>();
    }
    this.ext.put(key, extItem);
    return this;
  }

   /**
   * Extra is arbitrary data set by the session.
   * @return ext
  **/
  @ApiModelProperty(value = "Extra is arbitrary data set by the session.")
  public Map<String, Object> getExt() {
    return ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }

  public OAuth2TokenIntrospection iat(Long iat) {
    this.iat = iat;
    return this;
  }

   /**
   * Issued at is an integer timestamp, measured in the number of seconds since January 1 1970 UTC, indicating when this token was originally issued.
   * @return iat
  **/
  @ApiModelProperty(value = "Issued at is an integer timestamp, measured in the number of seconds since January 1 1970 UTC, indicating when this token was originally issued.")
  public Long getIat() {
    return iat;
  }

  public void setIat(Long iat) {
    this.iat = iat;
  }

  public OAuth2TokenIntrospection iss(String iss) {
    this.iss = iss;
    return this;
  }

   /**
   * IssuerURL is a string representing the issuer of this token
   * @return iss
  **/
  @ApiModelProperty(value = "IssuerURL is a string representing the issuer of this token")
  public String getIss() {
    return iss;
  }

  public void setIss(String iss) {
    this.iss = iss;
  }

  public OAuth2TokenIntrospection nbf(Long nbf) {
    this.nbf = nbf;
    return this;
  }

   /**
   * NotBefore is an integer timestamp, measured in the number of seconds since January 1 1970 UTC, indicating when this token is not to be used before.
   * @return nbf
  **/
  @ApiModelProperty(value = "NotBefore is an integer timestamp, measured in the number of seconds since January 1 1970 UTC, indicating when this token is not to be used before.")
  public Long getNbf() {
    return nbf;
  }

  public void setNbf(Long nbf) {
    this.nbf = nbf;
  }

  public OAuth2TokenIntrospection obfuscatedSubject(String obfuscatedSubject) {
    this.obfuscatedSubject = obfuscatedSubject;
    return this;
  }

   /**
   * ObfuscatedSubject is set when the subject identifier algorithm was set to \&quot;pairwise\&quot; during authorization. It is the &#x60;sub&#x60; value of the ID Token that was issued.
   * @return obfuscatedSubject
  **/
  @ApiModelProperty(value = "ObfuscatedSubject is set when the subject identifier algorithm was set to \"pairwise\" during authorization. It is the `sub` value of the ID Token that was issued.")
  public String getObfuscatedSubject() {
    return obfuscatedSubject;
  }

  public void setObfuscatedSubject(String obfuscatedSubject) {
    this.obfuscatedSubject = obfuscatedSubject;
  }

  public OAuth2TokenIntrospection scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Scope is a JSON string containing a space-separated list of scopes associated with this token.
   * @return scope
  **/
  @ApiModelProperty(value = "Scope is a JSON string containing a space-separated list of scopes associated with this token.")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public OAuth2TokenIntrospection sub(String sub) {
    this.sub = sub;
    return this;
  }

   /**
   * Subject of the token, as defined in JWT [RFC7519]. Usually a machine-readable identifier of the resource owner who authorized this token.
   * @return sub
  **/
  @ApiModelProperty(value = "Subject of the token, as defined in JWT [RFC7519]. Usually a machine-readable identifier of the resource owner who authorized this token.")
  public String getSub() {
    return sub;
  }

  public void setSub(String sub) {
    this.sub = sub;
  }

  public OAuth2TokenIntrospection tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

   /**
   * TokenType is the introspected token&#39;s type, for example &#x60;access_token&#x60; or &#x60;refresh_token&#x60;.
   * @return tokenType
  **/
  @ApiModelProperty(value = "TokenType is the introspected token's type, for example `access_token` or `refresh_token`.")
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public OAuth2TokenIntrospection username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Username is a human-readable identifier for the resource owner who authorized this token.
   * @return username
  **/
  @ApiModelProperty(value = "Username is a human-readable identifier for the resource owner who authorized this token.")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuth2TokenIntrospection oAuth2TokenIntrospection = (OAuth2TokenIntrospection) o;
    return Objects.equals(this.active, oAuth2TokenIntrospection.active) &&
        Objects.equals(this.aud, oAuth2TokenIntrospection.aud) &&
        Objects.equals(this.clientId, oAuth2TokenIntrospection.clientId) &&
        Objects.equals(this.exp, oAuth2TokenIntrospection.exp) &&
        Objects.equals(this.ext, oAuth2TokenIntrospection.ext) &&
        Objects.equals(this.iat, oAuth2TokenIntrospection.iat) &&
        Objects.equals(this.iss, oAuth2TokenIntrospection.iss) &&
        Objects.equals(this.nbf, oAuth2TokenIntrospection.nbf) &&
        Objects.equals(this.obfuscatedSubject, oAuth2TokenIntrospection.obfuscatedSubject) &&
        Objects.equals(this.scope, oAuth2TokenIntrospection.scope) &&
        Objects.equals(this.sub, oAuth2TokenIntrospection.sub) &&
        Objects.equals(this.tokenType, oAuth2TokenIntrospection.tokenType) &&
        Objects.equals(this.username, oAuth2TokenIntrospection.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, aud, clientId, exp, ext, iat, iss, nbf, obfuscatedSubject, scope, sub, tokenType, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuth2TokenIntrospection {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    aud: ").append(toIndentedString(aud)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    exp: ").append(toIndentedString(exp)).append("\n");
    sb.append("    ext: ").append(toIndentedString(ext)).append("\n");
    sb.append("    iat: ").append(toIndentedString(iat)).append("\n");
    sb.append("    iss: ").append(toIndentedString(iss)).append("\n");
    sb.append("    nbf: ").append(toIndentedString(nbf)).append("\n");
    sb.append("    obfuscatedSubject: ").append(toIndentedString(obfuscatedSubject)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    sub: ").append(toIndentedString(sub)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

