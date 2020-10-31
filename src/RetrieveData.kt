fun retrieveData(connected: Boolean): String {
    if(connected) {
        return CloudStorage.getRemoteData()
    } else {
        return DeviceStorage.getLocalData()
    }
}


// this is literally an object from JS
object DeviceStorage {
    // similar to JS arrow functions when only only has one line you can define it inline.
    fun getLocalData() = "Local Data"
}

object CloudStorage {
    fun getRemoteData() = "Remote data"
}