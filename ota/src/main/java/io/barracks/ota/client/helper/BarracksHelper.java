/*
 *    Copyright 2016 Barracks Solutions Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package io.barracks.ota.client.helper;

import io.barracks.ota.client.Defaults;

/**
 * Created by saiimons on 29/04/2016.
 */
public class BarracksHelper {
    private final String apiKey;
    private final String baseUrl;

    public BarracksHelper(String apiKey) {
        this(apiKey, Defaults.DEFAULT_BASE_URL);
    }

    public BarracksHelper(String apiKey, String baseUrl) {
        this.apiKey = apiKey;
        this.baseUrl = baseUrl;
    }

    public UpdateCheckHelper getUpdateCheckHelper() {
        return new UpdateCheckHelper(apiKey, baseUrl);
    }

    public PackageDownloadHelper getPackageDownloadHelper() {
        return new PackageDownloadHelper(apiKey);
    }
}