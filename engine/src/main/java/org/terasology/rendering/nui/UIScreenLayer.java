/*
 * Copyright 2014 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.rendering.nui;

/**
 */
public interface UIScreenLayer extends ControlWidget {

    boolean isLowerLayerVisible();

    boolean isReleasingMouse();

    boolean isModal();

    NUIManager getManager();

    /**
     * Called when the layer becomes visible again (all layers on top have been closed)
     */
    void onShow();

    /**
     * Called when the layer becomes invisible (at least one other layer is on top)
     */
    void onHide();
}
