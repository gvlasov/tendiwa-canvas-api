package org.tendiwa.canvas.implementations

import org.tendiwa.canvas.api.Canvas
import org.tendiwa.geometry.circles.Circle
import org.tendiwa.geometry.points.Point
import org.tendiwa.geometry.rectangles.Rectangle
import org.tendiwa.geometry.segments.Segment
import org.tendiwa.grid.dimensions.GridDimension
import org.tendiwa.grid.dimensions.by
import org.tendiwa.grid.rectangles.GridRectangle
import java.awt.Color

/**
 * Canvas that does nothing.
 */
class NullCanvas() : Canvas {
    override val scale: Int
        get() = 1
    override val size: GridDimension
        get() = 1 by 1
    override val textLineHeight: Int
        get() = 1

    override fun draw(x: Int, y: Int, color: Color) {
    }

    override fun draw(rectangle: Rectangle, color: Color) {
    }

    override fun draw(rectangle: GridRectangle, color: Color) {
    }

    override fun write(text: String, start: Point, color: Color) {
    }

    override fun draw(segment: Segment, color: Color) {
    }

    override fun draw(circle: Circle, color: Color) {
    }

    override fun textWidth(text: String): Int =
        1

    override fun clear() {
    }

    override fun fillBackground(color: Color) {
    }

    override fun drawText(text: String, start: Point, color: Color, fontScale: Double) {
    }
}