package com.doaha.model.generator.model

import com.google.android.gms.maps.model.LatLng
import org.json.JSONArray

class LetterR (centerPoint: LatLng, offset: Int) : Character(centerPoint, offset) {
    override fun generateCharacterJSONArrayObject(): JSONArray {
        //1
        jsonArrayChild.put(funCreateLatLngPoint(startPointLat, startPointLong))
        //2
        jsonArrayChild.put(funCreateLatLngPoint(startPointLat, startPointLong + longLine / 3))
        //3
        jsonArrayChild.put(
            funCreateLatLngPoint(
                startPointLat + 2 * longLine / 3,
                startPointLong + longLine / 3
            )
        )
        //4
        jsonArrayChild.put(funCreateLatLngPoint(startPointLat, startPointLong + 2 * longLine / 3))
        //5
        jsonArrayChild.put(funCreateLatLngPoint(startPointLat, startPointLong + longLine))
        //6
        jsonArrayChild.put(
            funCreateLatLngPoint(
                startPointLat + 4 * longLine / 3,
                startPointLong + longLine / 3
            )
        )
        //7
        jsonArrayChild.put(
            funCreateLatLngPoint(
                startPointLat + 4 * longLine / 3,
                startPointLong + longLine
            )
        )
        //8
        jsonArrayChild.put(
            funCreateLatLngPoint(
                startPointLat + 2 * longLine,
                startPointLong + longLine
            )
        )
        //9
        jsonArrayChild.put(funCreateLatLngPoint(startPointLat + 2 * longLine, startPointLong))
        //10
        jsonArrayChild.put(funCreateLatLngPoint(startPointLat, startPointLong))
        jsonArrayParent.put(jsonArrayChild)

        //1
        jsonArrayChild2.put(
            funCreateLatLngPoint(
                startPointLat + 9 * longLine / 6,
                startPointLong + 2 * longLine / 6
            )
        )
        //2
        jsonArrayChild2.put(
            funCreateLatLngPoint(
                startPointLat + 9 * longLine / 6,
                startPointLong + 4 * longLine / 6
            )
        )
        //3
        jsonArrayChild2.put(
            funCreateLatLngPoint(
                startPointLat + 11 * longLine / 6,
                startPointLong + 4 * longLine / 6
            )
        )
        //4
        jsonArrayChild2.put(
            funCreateLatLngPoint(
                startPointLat + 11 * longLine / 6,
                startPointLong + 2 * longLine / 6
            )
        )
        //5
        jsonArrayChild2.put(
            funCreateLatLngPoint(
                startPointLat + 9 * longLine / 6,
                startPointLong + 2 * longLine / 6
            )
        )
        jsonArrayParent.put(jsonArrayChild2)

        return jsonArrayParent
    }
}