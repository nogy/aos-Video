/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.archos.mediacenter.video.leanback.presenter;

import androidx.leanback.widget.AbstractDetailsDescriptionPresenter;

import com.archos.mediacenter.video.leanback.adapter.object.Shortcut;

public class ShortcutDetailsPresenter extends AbstractDetailsDescriptionPresenter {

    @Override
    protected void onBindDescription(ViewHolder viewHolder, Object item) {
        Shortcut shortcut = (Shortcut) item;
        viewHolder.getTitle().setText(shortcut.getName());
        
        String uri = shortcut.getFriendlyUri();
        
        if (uri.endsWith("/"))
            uri = uri.substring(0, uri.length() - 1);

        viewHolder.getSubtitle().setText(uri);
    }
}
