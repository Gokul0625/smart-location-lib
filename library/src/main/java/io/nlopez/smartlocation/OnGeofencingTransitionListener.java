package io.nlopez.smartlocation;

import com.google.android.gms.location.Geofence;

/**
 * Created by mrm on 4/1/15.
 */
public interface OnGeofencingTransitionListener {
    void onGeofenceTransition(Geofence geofence, int transitionType);
}