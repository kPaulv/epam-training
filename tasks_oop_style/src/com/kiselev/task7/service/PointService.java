package com.kiselev.task7.service;

import com.kiselev.task7.entity.Point;

public class PointService {
  public Point findClosestPoint(Point point1, Point point2) {
    double distance1 = Math.hypot(point1.getX(), point1.getY());
    double distance2 = Math.hypot(point2.getX(), point2.getY());
    return distance1 > distance2 ? point2 : point1;
  }
}
