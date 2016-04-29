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

import io.barracks.ota.client.api.UpdateDetails;

/**
 * Created by saiimons on 27/04/2016.
 */
public interface PackageDownloadCallback {
    void onDownloadSuccess(UpdateDetails response, String path);

    void onDownloadFailure(Throwable throwable);

    void onDownloadProgress(UpdateDetails response, int progress);
}