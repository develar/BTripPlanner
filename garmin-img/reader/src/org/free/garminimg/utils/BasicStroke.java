package org.free.garminimg.utils;

import java.awt.*;

public class BasicStroke implements Stroke {
  public BasicStroke(float f) {

    //setStrokeWidth(f);
    //setAntiAlias(true);
  }

  public BasicStroke(float f, float g,
                       float[] tinydash, float h) {

  }

  //public BasicStroke(float f, Paint.Cap cap, Paint.Join join, float g,
  //                   float[] tinydash, float h) {
  //  this(f);
    //setStrokeCap(cap);
    //setStrokeJoin(join);
    //setStrokeMiter(g);
    //PathEffect effect = null;
    //if (tinydash != null) {
    //  effect = new DashPathEffect(tinydash, h);
    //  setPathEffect(effect);
    //}
  //}

  @Override
  public Shape createStrokedShape(Shape shape) {
    //shape.
    return null;
  }
}
