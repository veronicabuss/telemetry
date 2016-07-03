/**
* Sunseeker Telemety
*
* @author Alec Carpenter <alecgunnar@gmail.com>
* @date July 2, 2016
*/

package sunseeker.telemetry;

import java.util.Arrays;

class FileDataSource implements DataSourceInterface {
    protected String[] types = {
        "speed",
        "voltage"
    };

    public String[] getTypes () {
        return types;
    }

    public boolean provides (String type) {
        return Arrays.binarySearch(types, type) >= 0;
    }
}