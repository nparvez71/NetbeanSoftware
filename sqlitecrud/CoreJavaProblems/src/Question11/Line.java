/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;


class Line {

    public class Point {

        public int x, y;
    }

    public Point getPoint() {

        return new Point();
    }
}

class Triangle {

    public Triangle() {

        Line.Point p = (new Line()).getPoint();
    }
}
