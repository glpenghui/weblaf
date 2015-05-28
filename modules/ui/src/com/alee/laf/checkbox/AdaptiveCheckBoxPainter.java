package com.alee.laf.checkbox;

import com.alee.extended.painter.AdaptivePainter;
import com.alee.extended.painter.Painter;

import javax.swing.*;
import java.awt.*;

/**
 * Simple CheckBoxPainter adapter class.
 * It is used to install simple non-specific painters into WebCheckBoxUI.
 *
 * @author Alexandr Zernov
 */

public class AdaptiveCheckBoxPainter<E extends JCheckBox, U extends WebCheckBoxUI> extends AdaptivePainter<E, U>
        implements CheckBoxPainter<E, U>
{
    /**
     * Constructs new AdaptiveCheckBoxPainter for the specified painter.
     *
     * @param painter painter to adapt
     */
    public AdaptiveCheckBoxPainter ( final Painter painter )
    {
        super ( painter );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rectangle getIconRect ()
    {
        return null;
    }
}