package com.doaha.model.generator.model

import com.google.android.gms.maps.model.LatLng
import org.json.JSONArray

class Unknown(centerPoint: LatLng, offset: Int) : Character(centerPoint, offset) {

    override fun generateCharacterJSONArrayObject(): JSONArray {
        jsonArrayChild.put(funCreateLatLngPoint(startPointLat, startPointLong))
        jsonArrayChild.put(funCreateLatLngPoint(startPointLat, startPointLong + longLine))
        jsonArrayChild.put(funCreateLatLngPoint(startPointLat + shortLine, startPointLong + longLine))
        jsonArrayChild.put(funCreateLatLngPoint(startPointLat + shortLine, startPointLong))
        jsonArrayChild.put(funCreateLatLngPoint(startPointLat, startPointLong))
        jsonArrayParent.put(jsonArrayChild)
        return jsonArrayParent
    }
}