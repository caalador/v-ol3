/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vaadin.gwtol3.client.interaction;

/**
 * Without this interaction not worked DragBoxInteraction
 * @author iserge
 */
public class DragZoomInteraction extends DragBoxInteraction {
    protected DragZoomInteraction() {
        //
    }
    
    public static final native DragZoomInteraction create() /*-{
        return new $wnd.ol.interaction.DragZoom();
    }-*/;
}
