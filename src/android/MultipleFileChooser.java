package cordova.plugin.multiplefilechooser;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class MultipleFileChooser extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("add")) {
            String message = args.getString(0);
            this.add(message, callbackContext);
            return true;
        }
        return false;
    }

    private void add(String message, CallbackContext callbackContext) {
            callbackContext.success("String from Plugin");
    }
}
