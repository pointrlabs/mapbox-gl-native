// This file is generated. Edit android/platform/scripts/generate-style-code.js, then run `make style-code-android`.
package com.mapbox.mapboxsdk.style.layers;

/**
 * Circle Layer
 */
public class CircleLayer extends Layer {

    public CircleLayer(long nativePtr) {
        super(nativePtr);
    }

    public CircleLayer(String layerId, String sourceId) {
        initialize(layerId, sourceId);
    }

    protected native void initialize(String layerId, String sourceId);

    public void setSourceLayer(String sourceLayer) {
        nativeSetSourceLayer(sourceLayer);
    }

    public void setFilter(Filter.Statement filter) {
        this.setFilter(filter.toArray());
    }

    public void setFilter(Object[] filter) {
        nativeSetFilter(filter);
    }

}
