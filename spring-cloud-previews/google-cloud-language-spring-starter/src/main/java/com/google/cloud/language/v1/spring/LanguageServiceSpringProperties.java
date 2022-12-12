/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.language.v1.spring;

import com.google.api.core.BetaApi;
import com.google.cloud.spring.core.Credentials;
import com.google.cloud.spring.core.CredentialsSupplier;
import javax.annotation.Generated;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/** Provides default property values for LanguageService client bean */
@Generated("by google-cloud-spring-generator")
@BetaApi("Autogenerated Spring autoconfiguration is not yet stable")
@ConfigurationProperties("com.google.cloud.language.v1.spring.auto.language-service")
public class LanguageServiceSpringProperties implements CredentialsSupplier {
  @NestedConfigurationProperty
  private final Credentials credentials =
      new Credentials(
          "https://www.googleapis.com/auth/cloud-language",
          "https://www.googleapis.com/auth/cloud-platform");

  private String quotaProjectId;
  private Integer executorThreadCount;
  private boolean useRest = false;
  private Duration analyzeSentimentInitialRetryDelay;
  private Double analyzeSentimentRetryDelayMultiplier;
  private Duration analyzeSentimentMaxRetryDelay;
  private Duration analyzeSentimentInitialRpcTimeout;
  private Double analyzeSentimentRpcTimeoutMultiplier;
  private Duration analyzeSentimentMaxRpcTimeout;
  private Duration analyzeSentimentTotalTimeout;
  private Duration analyzeEntitiesInitialRetryDelay;
  private Double analyzeEntitiesRetryDelayMultiplier;
  private Duration analyzeEntitiesMaxRetryDelay;
  private Duration analyzeEntitiesInitialRpcTimeout;
  private Double analyzeEntitiesRpcTimeoutMultiplier;
  private Duration analyzeEntitiesMaxRpcTimeout;
  private Duration analyzeEntitiesTotalTimeout;
  private Duration analyzeEntitySentimentInitialRetryDelay;
  private Double analyzeEntitySentimentRetryDelayMultiplier;
  private Duration analyzeEntitySentimentMaxRetryDelay;
  private Duration analyzeEntitySentimentInitialRpcTimeout;
  private Double analyzeEntitySentimentRpcTimeoutMultiplier;
  private Duration analyzeEntitySentimentMaxRpcTimeout;
  private Duration analyzeEntitySentimentTotalTimeout;
  private Duration analyzeSyntaxInitialRetryDelay;
  private Double analyzeSyntaxRetryDelayMultiplier;
  private Duration analyzeSyntaxMaxRetryDelay;
  private Duration analyzeSyntaxInitialRpcTimeout;
  private Double analyzeSyntaxRpcTimeoutMultiplier;
  private Duration analyzeSyntaxMaxRpcTimeout;
  private Duration analyzeSyntaxTotalTimeout;
  private Duration classifyTextInitialRetryDelay;
  private Double classifyTextRetryDelayMultiplier;
  private Duration classifyTextMaxRetryDelay;
  private Duration classifyTextInitialRpcTimeout;
  private Double classifyTextRpcTimeoutMultiplier;
  private Duration classifyTextMaxRpcTimeout;
  private Duration classifyTextTotalTimeout;
  private Duration annotateTextInitialRetryDelay;
  private Double annotateTextRetryDelayMultiplier;
  private Duration annotateTextMaxRetryDelay;
  private Duration annotateTextInitialRpcTimeout;
  private Double annotateTextRpcTimeoutMultiplier;
  private Duration annotateTextMaxRpcTimeout;
  private Duration annotateTextTotalTimeout;

  @Override
  public Credentials getCredentials() {
    return this.credentials;
  }

  public String getQuotaProjectId() {
    return this.quotaProjectId;
  }

  public void setQuotaProjectId(String quotaProjectId) {
    this.quotaProjectId = quotaProjectId;
  }

  public boolean getUseRest() {
    return this.useRest;
  }

  public void setUseRest(boolean useRest) {
    this.useRest = useRest;
  }

  public Integer getExecutorThreadCount() {
    return this.executorThreadCount;
  }

  public void setExecutorThreadCount(Integer executorThreadCount) {
    this.executorThreadCount = executorThreadCount;
  }

  public Duration getAnalyzeSentimentInitialRetryDelay() {
    return this.analyzeSentimentInitialRetryDelay;
  }

  public void setAnalyzeSentimentInitialRetryDelay(
      java.time.Duration analyzeSentimentInitialRetryDelay) {
    this.analyzeSentimentInitialRetryDelay =
        Duration.parse(analyzeSentimentInitialRetryDelay.toString());
  }

  public Double getAnalyzeSentimentRetryDelayMultiplier() {
    return this.analyzeSentimentRetryDelayMultiplier;
  }

  public void setAnalyzeSentimentRetryDelayMultiplier(Double analyzeSentimentRetryDelayMultiplier) {
    this.analyzeSentimentRetryDelayMultiplier = analyzeSentimentRetryDelayMultiplier;
  }

  public Duration getAnalyzeSentimentMaxRetryDelay() {
    return this.analyzeSentimentMaxRetryDelay;
  }

  public void setAnalyzeSentimentMaxRetryDelay(java.time.Duration analyzeSentimentMaxRetryDelay) {
    this.analyzeSentimentMaxRetryDelay = Duration.parse(analyzeSentimentMaxRetryDelay.toString());
  }

  public Duration getAnalyzeSentimentInitialRpcTimeout() {
    return this.analyzeSentimentInitialRpcTimeout;
  }

  public void setAnalyzeSentimentInitialRpcTimeout(
      java.time.Duration analyzeSentimentInitialRpcTimeout) {
    this.analyzeSentimentInitialRpcTimeout =
        Duration.parse(analyzeSentimentInitialRpcTimeout.toString());
  }

  public Double getAnalyzeSentimentRpcTimeoutMultiplier() {
    return this.analyzeSentimentRpcTimeoutMultiplier;
  }

  public void setAnalyzeSentimentRpcTimeoutMultiplier(Double analyzeSentimentRpcTimeoutMultiplier) {
    this.analyzeSentimentRpcTimeoutMultiplier = analyzeSentimentRpcTimeoutMultiplier;
  }

  public Duration getAnalyzeSentimentMaxRpcTimeout() {
    return this.analyzeSentimentMaxRpcTimeout;
  }

  public void setAnalyzeSentimentMaxRpcTimeout(java.time.Duration analyzeSentimentMaxRpcTimeout) {
    this.analyzeSentimentMaxRpcTimeout = Duration.parse(analyzeSentimentMaxRpcTimeout.toString());
  }

  public Duration getAnalyzeSentimentTotalTimeout() {
    return this.analyzeSentimentTotalTimeout;
  }

  public void setAnalyzeSentimentTotalTimeout(java.time.Duration analyzeSentimentTotalTimeout) {
    this.analyzeSentimentTotalTimeout = Duration.parse(analyzeSentimentTotalTimeout.toString());
  }

  public Duration getAnalyzeEntitiesInitialRetryDelay() {
    return this.analyzeEntitiesInitialRetryDelay;
  }

  public void setAnalyzeEntitiesInitialRetryDelay(
      java.time.Duration analyzeEntitiesInitialRetryDelay) {
    this.analyzeEntitiesInitialRetryDelay =
        Duration.parse(analyzeEntitiesInitialRetryDelay.toString());
  }

  public Double getAnalyzeEntitiesRetryDelayMultiplier() {
    return this.analyzeEntitiesRetryDelayMultiplier;
  }

  public void setAnalyzeEntitiesRetryDelayMultiplier(Double analyzeEntitiesRetryDelayMultiplier) {
    this.analyzeEntitiesRetryDelayMultiplier = analyzeEntitiesRetryDelayMultiplier;
  }

  public Duration getAnalyzeEntitiesMaxRetryDelay() {
    return this.analyzeEntitiesMaxRetryDelay;
  }

  public void setAnalyzeEntitiesMaxRetryDelay(java.time.Duration analyzeEntitiesMaxRetryDelay) {
    this.analyzeEntitiesMaxRetryDelay = Duration.parse(analyzeEntitiesMaxRetryDelay.toString());
  }

  public Duration getAnalyzeEntitiesInitialRpcTimeout() {
    return this.analyzeEntitiesInitialRpcTimeout;
  }

  public void setAnalyzeEntitiesInitialRpcTimeout(
      java.time.Duration analyzeEntitiesInitialRpcTimeout) {
    this.analyzeEntitiesInitialRpcTimeout =
        Duration.parse(analyzeEntitiesInitialRpcTimeout.toString());
  }

  public Double getAnalyzeEntitiesRpcTimeoutMultiplier() {
    return this.analyzeEntitiesRpcTimeoutMultiplier;
  }

  public void setAnalyzeEntitiesRpcTimeoutMultiplier(Double analyzeEntitiesRpcTimeoutMultiplier) {
    this.analyzeEntitiesRpcTimeoutMultiplier = analyzeEntitiesRpcTimeoutMultiplier;
  }

  public Duration getAnalyzeEntitiesMaxRpcTimeout() {
    return this.analyzeEntitiesMaxRpcTimeout;
  }

  public void setAnalyzeEntitiesMaxRpcTimeout(java.time.Duration analyzeEntitiesMaxRpcTimeout) {
    this.analyzeEntitiesMaxRpcTimeout = Duration.parse(analyzeEntitiesMaxRpcTimeout.toString());
  }

  public Duration getAnalyzeEntitiesTotalTimeout() {
    return this.analyzeEntitiesTotalTimeout;
  }

  public void setAnalyzeEntitiesTotalTimeout(java.time.Duration analyzeEntitiesTotalTimeout) {
    this.analyzeEntitiesTotalTimeout = Duration.parse(analyzeEntitiesTotalTimeout.toString());
  }

  public Duration getAnalyzeEntitySentimentInitialRetryDelay() {
    return this.analyzeEntitySentimentInitialRetryDelay;
  }

  public void setAnalyzeEntitySentimentInitialRetryDelay(
      java.time.Duration analyzeEntitySentimentInitialRetryDelay) {
    this.analyzeEntitySentimentInitialRetryDelay =
        Duration.parse(analyzeEntitySentimentInitialRetryDelay.toString());
  }

  public Double getAnalyzeEntitySentimentRetryDelayMultiplier() {
    return this.analyzeEntitySentimentRetryDelayMultiplier;
  }

  public void setAnalyzeEntitySentimentRetryDelayMultiplier(
      Double analyzeEntitySentimentRetryDelayMultiplier) {
    this.analyzeEntitySentimentRetryDelayMultiplier = analyzeEntitySentimentRetryDelayMultiplier;
  }

  public Duration getAnalyzeEntitySentimentMaxRetryDelay() {
    return this.analyzeEntitySentimentMaxRetryDelay;
  }

  public void setAnalyzeEntitySentimentMaxRetryDelay(
      java.time.Duration analyzeEntitySentimentMaxRetryDelay) {
    this.analyzeEntitySentimentMaxRetryDelay =
        Duration.parse(analyzeEntitySentimentMaxRetryDelay.toString());
  }

  public Duration getAnalyzeEntitySentimentInitialRpcTimeout() {
    return this.analyzeEntitySentimentInitialRpcTimeout;
  }

  public void setAnalyzeEntitySentimentInitialRpcTimeout(
      java.time.Duration analyzeEntitySentimentInitialRpcTimeout) {
    this.analyzeEntitySentimentInitialRpcTimeout =
        Duration.parse(analyzeEntitySentimentInitialRpcTimeout.toString());
  }

  public Double getAnalyzeEntitySentimentRpcTimeoutMultiplier() {
    return this.analyzeEntitySentimentRpcTimeoutMultiplier;
  }

  public void setAnalyzeEntitySentimentRpcTimeoutMultiplier(
      Double analyzeEntitySentimentRpcTimeoutMultiplier) {
    this.analyzeEntitySentimentRpcTimeoutMultiplier = analyzeEntitySentimentRpcTimeoutMultiplier;
  }

  public Duration getAnalyzeEntitySentimentMaxRpcTimeout() {
    return this.analyzeEntitySentimentMaxRpcTimeout;
  }

  public void setAnalyzeEntitySentimentMaxRpcTimeout(
      java.time.Duration analyzeEntitySentimentMaxRpcTimeout) {
    this.analyzeEntitySentimentMaxRpcTimeout =
        Duration.parse(analyzeEntitySentimentMaxRpcTimeout.toString());
  }

  public Duration getAnalyzeEntitySentimentTotalTimeout() {
    return this.analyzeEntitySentimentTotalTimeout;
  }

  public void setAnalyzeEntitySentimentTotalTimeout(
      java.time.Duration analyzeEntitySentimentTotalTimeout) {
    this.analyzeEntitySentimentTotalTimeout =
        Duration.parse(analyzeEntitySentimentTotalTimeout.toString());
  }

  public Duration getAnalyzeSyntaxInitialRetryDelay() {
    return this.analyzeSyntaxInitialRetryDelay;
  }

  public void setAnalyzeSyntaxInitialRetryDelay(java.time.Duration analyzeSyntaxInitialRetryDelay) {
    this.analyzeSyntaxInitialRetryDelay = Duration.parse(analyzeSyntaxInitialRetryDelay.toString());
  }

  public Double getAnalyzeSyntaxRetryDelayMultiplier() {
    return this.analyzeSyntaxRetryDelayMultiplier;
  }

  public void setAnalyzeSyntaxRetryDelayMultiplier(Double analyzeSyntaxRetryDelayMultiplier) {
    this.analyzeSyntaxRetryDelayMultiplier = analyzeSyntaxRetryDelayMultiplier;
  }

  public Duration getAnalyzeSyntaxMaxRetryDelay() {
    return this.analyzeSyntaxMaxRetryDelay;
  }

  public void setAnalyzeSyntaxMaxRetryDelay(java.time.Duration analyzeSyntaxMaxRetryDelay) {
    this.analyzeSyntaxMaxRetryDelay = Duration.parse(analyzeSyntaxMaxRetryDelay.toString());
  }

  public Duration getAnalyzeSyntaxInitialRpcTimeout() {
    return this.analyzeSyntaxInitialRpcTimeout;
  }

  public void setAnalyzeSyntaxInitialRpcTimeout(java.time.Duration analyzeSyntaxInitialRpcTimeout) {
    this.analyzeSyntaxInitialRpcTimeout = Duration.parse(analyzeSyntaxInitialRpcTimeout.toString());
  }

  public Double getAnalyzeSyntaxRpcTimeoutMultiplier() {
    return this.analyzeSyntaxRpcTimeoutMultiplier;
  }

  public void setAnalyzeSyntaxRpcTimeoutMultiplier(Double analyzeSyntaxRpcTimeoutMultiplier) {
    this.analyzeSyntaxRpcTimeoutMultiplier = analyzeSyntaxRpcTimeoutMultiplier;
  }

  public Duration getAnalyzeSyntaxMaxRpcTimeout() {
    return this.analyzeSyntaxMaxRpcTimeout;
  }

  public void setAnalyzeSyntaxMaxRpcTimeout(java.time.Duration analyzeSyntaxMaxRpcTimeout) {
    this.analyzeSyntaxMaxRpcTimeout = Duration.parse(analyzeSyntaxMaxRpcTimeout.toString());
  }

  public Duration getAnalyzeSyntaxTotalTimeout() {
    return this.analyzeSyntaxTotalTimeout;
  }

  public void setAnalyzeSyntaxTotalTimeout(java.time.Duration analyzeSyntaxTotalTimeout) {
    this.analyzeSyntaxTotalTimeout = Duration.parse(analyzeSyntaxTotalTimeout.toString());
  }

  public Duration getClassifyTextInitialRetryDelay() {
    return this.classifyTextInitialRetryDelay;
  }

  public void setClassifyTextInitialRetryDelay(java.time.Duration classifyTextInitialRetryDelay) {
    this.classifyTextInitialRetryDelay = Duration.parse(classifyTextInitialRetryDelay.toString());
  }

  public Double getClassifyTextRetryDelayMultiplier() {
    return this.classifyTextRetryDelayMultiplier;
  }

  public void setClassifyTextRetryDelayMultiplier(Double classifyTextRetryDelayMultiplier) {
    this.classifyTextRetryDelayMultiplier = classifyTextRetryDelayMultiplier;
  }

  public Duration getClassifyTextMaxRetryDelay() {
    return this.classifyTextMaxRetryDelay;
  }

  public void setClassifyTextMaxRetryDelay(java.time.Duration classifyTextMaxRetryDelay) {
    this.classifyTextMaxRetryDelay = Duration.parse(classifyTextMaxRetryDelay.toString());
  }

  public Duration getClassifyTextInitialRpcTimeout() {
    return this.classifyTextInitialRpcTimeout;
  }

  public void setClassifyTextInitialRpcTimeout(java.time.Duration classifyTextInitialRpcTimeout) {
    this.classifyTextInitialRpcTimeout = Duration.parse(classifyTextInitialRpcTimeout.toString());
  }

  public Double getClassifyTextRpcTimeoutMultiplier() {
    return this.classifyTextRpcTimeoutMultiplier;
  }

  public void setClassifyTextRpcTimeoutMultiplier(Double classifyTextRpcTimeoutMultiplier) {
    this.classifyTextRpcTimeoutMultiplier = classifyTextRpcTimeoutMultiplier;
  }

  public Duration getClassifyTextMaxRpcTimeout() {
    return this.classifyTextMaxRpcTimeout;
  }

  public void setClassifyTextMaxRpcTimeout(java.time.Duration classifyTextMaxRpcTimeout) {
    this.classifyTextMaxRpcTimeout = Duration.parse(classifyTextMaxRpcTimeout.toString());
  }

  public Duration getClassifyTextTotalTimeout() {
    return this.classifyTextTotalTimeout;
  }

  public void setClassifyTextTotalTimeout(java.time.Duration classifyTextTotalTimeout) {
    this.classifyTextTotalTimeout = Duration.parse(classifyTextTotalTimeout.toString());
  }

  public Duration getAnnotateTextInitialRetryDelay() {
    return this.annotateTextInitialRetryDelay;
  }

  public void setAnnotateTextInitialRetryDelay(java.time.Duration annotateTextInitialRetryDelay) {
    this.annotateTextInitialRetryDelay = Duration.parse(annotateTextInitialRetryDelay.toString());
  }

  public Double getAnnotateTextRetryDelayMultiplier() {
    return this.annotateTextRetryDelayMultiplier;
  }

  public void setAnnotateTextRetryDelayMultiplier(Double annotateTextRetryDelayMultiplier) {
    this.annotateTextRetryDelayMultiplier = annotateTextRetryDelayMultiplier;
  }

  public Duration getAnnotateTextMaxRetryDelay() {
    return this.annotateTextMaxRetryDelay;
  }

  public void setAnnotateTextMaxRetryDelay(java.time.Duration annotateTextMaxRetryDelay) {
    this.annotateTextMaxRetryDelay = Duration.parse(annotateTextMaxRetryDelay.toString());
  }

  public Duration getAnnotateTextInitialRpcTimeout() {
    return this.annotateTextInitialRpcTimeout;
  }

  public void setAnnotateTextInitialRpcTimeout(java.time.Duration annotateTextInitialRpcTimeout) {
    this.annotateTextInitialRpcTimeout = Duration.parse(annotateTextInitialRpcTimeout.toString());
  }

  public Double getAnnotateTextRpcTimeoutMultiplier() {
    return this.annotateTextRpcTimeoutMultiplier;
  }

  public void setAnnotateTextRpcTimeoutMultiplier(Double annotateTextRpcTimeoutMultiplier) {
    this.annotateTextRpcTimeoutMultiplier = annotateTextRpcTimeoutMultiplier;
  }

  public Duration getAnnotateTextMaxRpcTimeout() {
    return this.annotateTextMaxRpcTimeout;
  }

  public void setAnnotateTextMaxRpcTimeout(java.time.Duration annotateTextMaxRpcTimeout) {
    this.annotateTextMaxRpcTimeout = Duration.parse(annotateTextMaxRpcTimeout.toString());
  }

  public Duration getAnnotateTextTotalTimeout() {
    return this.annotateTextTotalTimeout;
  }

  public void setAnnotateTextTotalTimeout(java.time.Duration annotateTextTotalTimeout) {
    this.annotateTextTotalTimeout = Duration.parse(annotateTextTotalTimeout.toString());
  }
}
