package uk.co.datumedge.hamcrest.json;

import static org.skyscreamer.jsonassert.JSONCompare.compareJSON;
import static org.skyscreamer.jsonassert.JSONCompareMode.STRICT;
import static uk.co.datumedge.hamcrest.json.JSONAssertComparisonResult.resultOf;

import org.json.JSONArray;
import org.json.JSONException;

/**
 * A {@code JSONComparator} implementation that compares {@code JSONArray}s, backed by SkyScreamer's JSONAssert library.
 */
public final class JSONArrayAssertComparator implements JSONComparator<JSONArray> {
	
	@Override
	public JSONComparisonResult compare(JSONArray expected, JSONArray actual) throws JSONException {
		return resultOf(compareJSON(expected, actual, STRICT));
	}
}