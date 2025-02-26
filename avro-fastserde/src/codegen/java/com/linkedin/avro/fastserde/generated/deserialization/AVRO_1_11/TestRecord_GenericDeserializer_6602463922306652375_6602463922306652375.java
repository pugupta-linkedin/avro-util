
package com.linkedin.avro.fastserde.generated.deserialization.AVRO_1_11;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import com.linkedin.avro.fastserde.FastDeserializer;
import org.apache.avro.Schema;
import org.apache.avro.generic.IndexedRecord;
import org.apache.avro.io.Decoder;
import org.apache.avro.util.Utf8;

public class TestRecord_GenericDeserializer_6602463922306652375_6602463922306652375
    implements FastDeserializer<IndexedRecord>
{

    private final Schema readerSchema;
    private final Schema map_field0;

    public TestRecord_GenericDeserializer_6602463922306652375_6602463922306652375(Schema readerSchema) {
        this.readerSchema = readerSchema;
        this.map_field0 = readerSchema.getField("map_field").schema();
    }

    public IndexedRecord deserialize(IndexedRecord reuse, Decoder decoder)
        throws IOException
    {
        return deserializeTestRecord0((reuse), (decoder));
    }

    public IndexedRecord deserializeTestRecord0(Object reuse, Decoder decoder)
        throws IOException
    {
        IndexedRecord TestRecord;
        if ((((reuse)!= null)&&((reuse) instanceof IndexedRecord))&&(((IndexedRecord)(reuse)).getSchema() == readerSchema)) {
            TestRecord = ((IndexedRecord)(reuse));
        } else {
            TestRecord = new org.apache.avro.generic.GenericData.Record(readerSchema);
        }
        Map<Utf8, Utf8> map_field1 = null;
        long chunkLen0 = (decoder.readMapStart());
        if (chunkLen0 > 0) {
            Map<Utf8, Utf8> map_fieldReuse0 = null;
            Object oldMap0 = TestRecord.get(0);
            if (oldMap0 instanceof Map) {
                map_fieldReuse0 = ((Map) oldMap0);
            }
            if (map_fieldReuse0 != (null)) {
                map_fieldReuse0 .clear();
                map_field1 = map_fieldReuse0;
            } else {
                map_field1 = new HashMap<Utf8, Utf8>(((int)(((chunkLen0 * 4)+ 2)/ 3)));
            }
            do {
                for (int counter0 = 0; (counter0 <chunkLen0); counter0 ++) {
                    Utf8 key0 = (decoder.readString(null));
                    map_field1 .put(key0, (decoder).readString(null));
                }
                chunkLen0 = (decoder.mapNext());
            } while (chunkLen0 > 0);
        } else {
            map_field1 = new HashMap<Utf8, Utf8>(0);
        }
        TestRecord.put(0, map_field1);
        return TestRecord;
    }

}
