package org.vaadin.addon.vol3.client.layer;

import com.vaadin.shared.AbstractComponentState;
import org.vaadin.addon.vol3.client.OLExtent;

/**
 * Base class for layer states
 */
public class OLLayerState extends AbstractComponentState{

    public Double maxResolution;
    public Double minResolution;
    public Double opacity;
    public Boolean visible;
    public Integer zIndex;
    public OLExtent extent;
    public String inputProjection;
    public String title;
}
