package com.doaha.model.generator.model

import com.google.android.gms.maps.model.LatLng
import org.json.JSONArray

class LetterJ (centerPoint: LatLng, offset: Int) : Character(centerPoint, offset) {
    override fun generateCharacterJSONArrayObject(): JSONArray {
        //1
        jsonArrayChild.put(funCreateLatLngPoint(startPointLat, startPointLong))
        //2
        jsonArrayChild.put(funCreateLatLngPoint(startPointLat, startPointLong+3*longLine/4))
        //3
        jsonArrayChild.put(funCreateLatLngPoint(startPointLat+4*longLine/3, startPointLong+3*longLine/4))
        //4
        jsonArrayChild.put(funCreateLatLngPoint(startPointLat+4*longLine/3, startPointLong+longLine))
        //5
        jsonArrayChild.put(funCreateLatLngPoint(startPointLat+2*longLine, startPointLong+longLine))
        //6
        jsonArrayChild.put(funCreateLatLngPoint(startPointLat+2*longLine, startPointLong))
        //7
        jsonArrayChild.put(funCreateLatLngPoint(startPointLat+4*longLine/3, startPointLong))
        //8
        jsonArrayChild.put(funCreateLatLngPoint(startPointLat+4*longLine/3, startPointLong+longLine/4))
        //9
        jsonArrayChild.put(funCreateLatLngPoint(startPointLat+2*longLine/3, startPointLong+longLine/4))
        //10
        jsonArrayChild.put(funCreateLatLngPoint(startPointLat+2*longLine/3, startPointLong))
        //11
        jsonArrayChild.put(funCreateLatLngPoint(startPointLat, startPointLong))
        jsonArrayParent.put(jsonArrayChild)
        return jsonArrayParent
    }
}