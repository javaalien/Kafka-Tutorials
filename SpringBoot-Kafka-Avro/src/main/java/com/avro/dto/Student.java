package com.avro.dto;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Student extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8178613892013434500L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Student\",\"namespace\":\"com.avro.dto\",\"fields\":[{\"name\":\"studentName\",\"type\":\"string\"},{\"name\":\"studentId\",\"type\":\"string\"},{\"name\":\"age\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Student> ENCODER =
      new BinaryMessageEncoder<Student>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Student> DECODER =
      new BinaryMessageDecoder<Student>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Student> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Student> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Student>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Student to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Student from a ByteBuffer. */
  public static Student fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence studentName;
  @Deprecated public java.lang.CharSequence studentId;
  @Deprecated public int age;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Student() {}

  /**
   * All-args constructor.
   * @param studentName The new value for studentName
   * @param studentId The new value for studentId
   * @param age The new value for age
   */
  public Student(java.lang.CharSequence studentName, java.lang.CharSequence studentId, java.lang.Integer age) {
    this.studentName = studentName;
    this.studentId = studentId;
    this.age = age;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return studentName;
    case 1: return studentId;
    case 2: return age;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: studentName = (java.lang.CharSequence)value$; break;
    case 1: studentId = (java.lang.CharSequence)value$; break;
    case 2: age = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'studentName' field.
   * @return The value of the 'studentName' field.
   */
  public java.lang.CharSequence getStudentName() {
    return studentName;
  }

  /**
   * Sets the value of the 'studentName' field.
   * @param value the value to set.
   */
  public void setStudentName(java.lang.CharSequence value) {
    this.studentName = value;
  }

  /**
   * Gets the value of the 'studentId' field.
   * @return The value of the 'studentId' field.
   */
  public java.lang.CharSequence getStudentId() {
    return studentId;
  }

  /**
   * Sets the value of the 'studentId' field.
   * @param value the value to set.
   */
  public void setStudentId(java.lang.CharSequence value) {
    this.studentId = value;
  }

  /**
   * Gets the value of the 'age' field.
   * @return The value of the 'age' field.
   */
  public java.lang.Integer getAge() {
    return age;
  }

  /**
   * Sets the value of the 'age' field.
   * @param value the value to set.
   */
  public void setAge(java.lang.Integer value) {
    this.age = value;
  }

  /**
   * Creates a new Student RecordBuilder.
   * @return A new Student RecordBuilder
   */
  public static com.avro.dto.Student.Builder newBuilder() {
    return new com.avro.dto.Student.Builder();
  }

  /**
   * Creates a new Student RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Student RecordBuilder
   */
  public static com.avro.dto.Student.Builder newBuilder(com.avro.dto.Student.Builder other) {
    return new com.avro.dto.Student.Builder(other);
  }

  /**
   * Creates a new Student RecordBuilder by copying an existing Student instance.
   * @param other The existing instance to copy.
   * @return A new Student RecordBuilder
   */
  public static com.avro.dto.Student.Builder newBuilder(com.avro.dto.Student other) {
    return new com.avro.dto.Student.Builder(other);
  }

  /**
   * RecordBuilder for Student instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Student>
    implements org.apache.avro.data.RecordBuilder<Student> {

    private java.lang.CharSequence studentName;
    private java.lang.CharSequence studentId;
    private int age;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.avro.dto.Student.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.studentName)) {
        this.studentName = data().deepCopy(fields()[0].schema(), other.studentName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.studentId)) {
        this.studentId = data().deepCopy(fields()[1].schema(), other.studentId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.age)) {
        this.age = data().deepCopy(fields()[2].schema(), other.age);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Student instance
     * @param other The existing instance to copy.
     */
    private Builder(com.avro.dto.Student other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.studentName)) {
        this.studentName = data().deepCopy(fields()[0].schema(), other.studentName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.studentId)) {
        this.studentId = data().deepCopy(fields()[1].schema(), other.studentId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.age)) {
        this.age = data().deepCopy(fields()[2].schema(), other.age);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'studentName' field.
      * @return The value.
      */
    public java.lang.CharSequence getStudentName() {
      return studentName;
    }

    /**
      * Sets the value of the 'studentName' field.
      * @param value The value of 'studentName'.
      * @return This builder.
      */
    public com.avro.dto.Student.Builder setStudentName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.studentName = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'studentName' field has been set.
      * @return True if the 'studentName' field has been set, false otherwise.
      */
    public boolean hasStudentName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'studentName' field.
      * @return This builder.
      */
    public com.avro.dto.Student.Builder clearStudentName() {
      studentName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'studentId' field.
      * @return The value.
      */
    public java.lang.CharSequence getStudentId() {
      return studentId;
    }

    /**
      * Sets the value of the 'studentId' field.
      * @param value The value of 'studentId'.
      * @return This builder.
      */
    public com.avro.dto.Student.Builder setStudentId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.studentId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'studentId' field has been set.
      * @return True if the 'studentId' field has been set, false otherwise.
      */
    public boolean hasStudentId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'studentId' field.
      * @return This builder.
      */
    public com.avro.dto.Student.Builder clearStudentId() {
      studentId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'age' field.
      * @return The value.
      */
    public java.lang.Integer getAge() {
      return age;
    }

    /**
      * Sets the value of the 'age' field.
      * @param value The value of 'age'.
      * @return This builder.
      */
    public com.avro.dto.Student.Builder setAge(int value) {
      validate(fields()[2], value);
      this.age = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'age' field has been set.
      * @return True if the 'age' field has been set, false otherwise.
      */
    public boolean hasAge() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'age' field.
      * @return This builder.
      */
    public com.avro.dto.Student.Builder clearAge() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Student build() {
      try {
        Student record = new Student();
        record.studentName = fieldSetFlags()[0] ? this.studentName : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.studentId = fieldSetFlags()[1] ? this.studentId : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.age = fieldSetFlags()[2] ? this.age : (java.lang.Integer) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Student>
    WRITER$ = (org.apache.avro.io.DatumWriter<Student>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Student>
    READER$ = (org.apache.avro.io.DatumReader<Student>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
