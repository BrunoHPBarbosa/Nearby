package com.example.nearby.ui.util

import com.google.android.gms.maps.model.LatLng

fun findSouthwestPoint(points: List<LatLng>): LatLng {
    if (points.isEmpty()) return LatLng(0.0,0.0)

    var southwetsPoint = points[0]

    for (point in points) {
        if (point.latitude < southwetsPoint.latitude || (
            point.latitude == southwetsPoint.latitude && point.longitude <southwetsPoint.latitude)
            ){
            southwetsPoint = point
        }
    }
    return southwetsPoint
}

fun findNortheastPoint(points: List<LatLng>): LatLng {
    if (points.isEmpty()) return LatLng(0.0,0.0)

    var northeastPoint = points[0]

    for (point in points) {
        if (point.latitude > northeastPoint.latitude || (
                point.latitude == northeastPoint.latitude && point.longitude >northeastPoint.latitude)
        ){
            northeastPoint = point
        }
    }
    return northeastPoint
}
