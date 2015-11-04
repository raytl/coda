/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package nl.stcorp.coda;

public class codac implements codacConstants {
  public static String helper_version() {
    return codacJNI.helper_version();
  }

  public static SWIGTYPE_p_coda_cursor_struct new_coda_cursor() {
    long cPtr = codacJNI.new_coda_cursor();
    return (cPtr == 0) ? null : new SWIGTYPE_p_coda_cursor_struct(cPtr, false);
  }

  public static void delete_coda_cursor(SWIGTYPE_p_coda_cursor_struct self) {
    codacJNI.delete_coda_cursor(SWIGTYPE_p_coda_cursor_struct.getCPtr(self));
  }

  public static SWIGTYPE_p_coda_cursor_struct deepcopy_coda_cursor(SWIGTYPE_p_coda_cursor_struct self) {
    long cPtr = codacJNI.deepcopy_coda_cursor(SWIGTYPE_p_coda_cursor_struct.getCPtr(self));
    return (cPtr == 0) ? null : new SWIGTYPE_p_coda_cursor_struct(cPtr, false);
  }

  public static String helper_coda_cursor_read_string(SWIGTYPE_p_coda_cursor_struct cursor) {
    return codacJNI.helper_coda_cursor_read_string(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor));
  }

  public static String helper_coda_time_to_string(double datetime) {
    return codacJNI.helper_coda_time_to_string(datetime);
  }

  public static String helper_coda_time_to_utcstring(double datetime) {
    return codacJNI.helper_coda_time_to_utcstring(datetime);
  }

  public static void done() {
    codacJNI.done();
  }

  public static double NaN() {
    return codacJNI.NaN();
  }

  public static double PlusInf() {
    return codacJNI.PlusInf();
  }

  public static double MinInf() {
    return codacJNI.MinInf();
  }

  public static String type_get_format_name(FormatEnum format) {
    return codacJNI.type_get_format_name(format.swigValue());
  }

  public static String type_get_class_name(TypeClassEnum type_class) {
    return codacJNI.type_get_class_name(type_class.swigValue());
  }

  public static String type_get_native_type_name(NativeTypeEnum native_type) {
    return codacJNI.type_get_native_type_name(native_type.swigValue());
  }

  public static String type_get_special_type_name(SpecialTypeEnum special_type) {
    return codacJNI.type_get_special_type_name(special_type.swigValue());
  }

  public static String expression_get_type_name(ExpressionTypeEnum type) {
    return codacJNI.expression_get_type_name(type.swigValue());
  }

  public static void expression_delete(SWIGTYPE_p_coda_expression_struct expr) {
    codacJNI.expression_delete(SWIGTYPE_p_coda_expression_struct.getCPtr(expr));
  }

  public static int get_option_bypass_special_types() {
    return codacJNI.get_option_bypass_special_types();
  }

  public static int get_option_perform_boundary_checks() {
    return codacJNI.get_option_perform_boundary_checks();
  }

  public static int get_option_perform_conversions() {
    return codacJNI.get_option_perform_conversions();
  }

  public static int get_option_use_fast_size_expressions() {
    return codacJNI.get_option_use_fast_size_expressions();
  }

  public static int get_option_use_mmap() {
    return codacJNI.get_option_use_mmap();
  }

  public static int isNaN(double x) {
    return codacJNI.isNaN(x);
  }

  public static int isInf(double x) {
    return codacJNI.isInf(x);
  }

  public static int isPlusInf(double x) {
    return codacJNI.isPlusInf(x);
  }

  public static int isMinInf(double x) {
    return codacJNI.isMinInf(x);
  }

  public static int expression_is_constant(SWIGTYPE_p_coda_expression_struct expr) {
    return codacJNI.expression_is_constant(SWIGTYPE_p_coda_expression_struct.getCPtr(expr));
  }

  public static int cursor_read_double(SWIGTYPE_p_coda_cursor_struct cursor, double[] dst) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_read_double(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), dst);
  }

  public static int cursor_read_uint64(SWIGTYPE_p_coda_cursor_struct cursor, long[] dst) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_read_uint64(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), dst);
  }

  public static int cursor_read_char(SWIGTYPE_p_coda_cursor_struct cursor, byte[] dst) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_read_char(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), dst);
  }

  public static int cursor_read_char_array(SWIGTYPE_p_coda_cursor_struct cursor, byte[] dst, ArrayOrderingEnum array_ordering) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_read_char_array(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), dst, array_ordering.swigValue());
  }

  public static int init() throws nl.stcorp.coda.CodaException {
    return codacJNI.init();
  }

  public static int set_definition_path(String path) throws nl.stcorp.coda.CodaException {
    return codacJNI.set_definition_path(path);
  }

  public static int set_definition_path_conditional(String file, String searchpath, String relative_location) throws nl.stcorp.coda.CodaException {
    return codacJNI.set_definition_path_conditional(file, searchpath, relative_location);
  }

  public static int set_option_bypass_special_types(int enable) throws nl.stcorp.coda.CodaException {
    return codacJNI.set_option_bypass_special_types(enable);
  }

  public static int set_option_perform_boundary_checks(int enable) throws nl.stcorp.coda.CodaException {
    return codacJNI.set_option_perform_boundary_checks(enable);
  }

  public static int set_option_perform_conversions(int enable) throws nl.stcorp.coda.CodaException {
    return codacJNI.set_option_perform_conversions(enable);
  }

  public static int set_option_use_fast_size_expressions(int enable) throws nl.stcorp.coda.CodaException {
    return codacJNI.set_option_use_fast_size_expressions(enable);
  }

  public static int set_option_use_mmap(int enable) throws nl.stcorp.coda.CodaException {
    return codacJNI.set_option_use_mmap(enable);
  }

  public static int c_index_to_fortran_index(int num_dims, int[] dim, int index) throws nl.stcorp.coda.CodaException {
    return codacJNI.c_index_to_fortran_index(num_dims, dim, index);
  }

  public static int datetime_to_double(int YEAR, int MONTH, int DAY, int HOUR, int MINUTE, int SECOND, int MUSEC, double[] datetime) throws nl.stcorp.coda.CodaException {
    return codacJNI.datetime_to_double(YEAR, MONTH, DAY, HOUR, MINUTE, SECOND, MUSEC, datetime);
  }

  public static int double_to_datetime(double datetime, int[] YEAR, int[] MONTH, int[] DAY, int[] HOUR, int[] MINUTE, int[] SECOND, int[] MUSEC) throws nl.stcorp.coda.CodaException {
    return codacJNI.double_to_datetime(datetime, YEAR, MONTH, DAY, HOUR, MINUTE, SECOND, MUSEC);
  }

  public static int string_to_time(String str, double[] datetime) throws nl.stcorp.coda.CodaException {
    return codacJNI.string_to_time(str, datetime);
  }

  public static int utcdatetime_to_double(int YEAR, int MONTH, int DAY, int HOUR, int MINUTE, int SECOND, int MUSEC, double[] datetime) throws nl.stcorp.coda.CodaException {
    return codacJNI.utcdatetime_to_double(YEAR, MONTH, DAY, HOUR, MINUTE, SECOND, MUSEC, datetime);
  }

  public static int double_to_utcdatetime(double datetime, int[] YEAR, int[] MONTH, int[] DAY, int[] HOUR, int[] MINUTE, int[] SECOND, int[] MUSEC) throws nl.stcorp.coda.CodaException {
    return codacJNI.double_to_utcdatetime(datetime, YEAR, MONTH, DAY, HOUR, MINUTE, SECOND, MUSEC);
  }

  public static int utcstring_to_time(String str, double[] datetime) throws nl.stcorp.coda.CodaException {
    return codacJNI.utcstring_to_time(str, datetime);
  }

  public static int open(String filename, SWIGTYPE_p_coda_product_struct product) throws nl.stcorp.coda.CodaException {
    return codacJNI.open(filename, product);
  }

  public static int open_as(String filename, String product_class, String product_type, int version, SWIGTYPE_p_coda_product_struct product) throws nl.stcorp.coda.CodaException {
    return codacJNI.open_as(filename, product_class, product_type, version, product);
  }

  public static int close(SWIGTYPE_p_coda_product_struct product) throws nl.stcorp.coda.CodaException {
    return codacJNI.close(SWIGTYPE_p_coda_product_struct.getCPtr(product));
  }

  public static int get_product_filename(SWIGTYPE_p_coda_product_struct product, String[] filename) throws nl.stcorp.coda.CodaException {
    return codacJNI.get_product_filename(SWIGTYPE_p_coda_product_struct.getCPtr(product), filename);
  }

  public static int get_product_file_size(SWIGTYPE_p_coda_product_struct product, long[] file_size) throws nl.stcorp.coda.CodaException {
    return codacJNI.get_product_file_size(SWIGTYPE_p_coda_product_struct.getCPtr(product), file_size);
  }

  public static int get_product_format(SWIGTYPE_p_coda_product_struct product, int[] format) throws nl.stcorp.coda.CodaException {
    return codacJNI.get_product_format(SWIGTYPE_p_coda_product_struct.getCPtr(product), format);
  }

  public static int get_product_class(SWIGTYPE_p_coda_product_struct product, String[] product_class) throws nl.stcorp.coda.CodaException {
    return codacJNI.get_product_class(SWIGTYPE_p_coda_product_struct.getCPtr(product), product_class);
  }

  public static int get_product_type(SWIGTYPE_p_coda_product_struct product, String[] product_type) throws nl.stcorp.coda.CodaException {
    return codacJNI.get_product_type(SWIGTYPE_p_coda_product_struct.getCPtr(product), product_type);
  }

  public static int get_product_version(SWIGTYPE_p_coda_product_struct product, int[] version) throws nl.stcorp.coda.CodaException {
    return codacJNI.get_product_version(SWIGTYPE_p_coda_product_struct.getCPtr(product), version);
  }

  public static int get_product_definition_file(SWIGTYPE_p_coda_product_struct product, String[] definition_file) throws nl.stcorp.coda.CodaException {
    return codacJNI.get_product_definition_file(SWIGTYPE_p_coda_product_struct.getCPtr(product), definition_file);
  }

  public static int get_product_root_type(SWIGTYPE_p_coda_product_struct product, SWIGTYPE_p_coda_type_struct type) throws nl.stcorp.coda.CodaException {
    return codacJNI.get_product_root_type(SWIGTYPE_p_coda_product_struct.getCPtr(product), type);
  }

  public static int get_product_variable_value(SWIGTYPE_p_coda_product_struct product, String variable, int index, long[] value) throws nl.stcorp.coda.CodaException {
    return codacJNI.get_product_variable_value(SWIGTYPE_p_coda_product_struct.getCPtr(product), variable, index, value);
  }

  public static int type_has_attributes(SWIGTYPE_p_coda_type_struct type, int[] has_attributes) throws nl.stcorp.coda.CodaException {
    return codacJNI.type_has_attributes(SWIGTYPE_p_coda_type_struct.getCPtr(type), has_attributes);
  }

  public static int type_get_format(SWIGTYPE_p_coda_type_struct type, int[] format) throws nl.stcorp.coda.CodaException {
    return codacJNI.type_get_format(SWIGTYPE_p_coda_type_struct.getCPtr(type), format);
  }

  public static int type_get_class(SWIGTYPE_p_coda_type_struct type, int[] type_class) throws nl.stcorp.coda.CodaException {
    return codacJNI.type_get_class(SWIGTYPE_p_coda_type_struct.getCPtr(type), type_class);
  }

  public static int type_get_read_type(SWIGTYPE_p_coda_type_struct type, int[] read_type) throws nl.stcorp.coda.CodaException {
    return codacJNI.type_get_read_type(SWIGTYPE_p_coda_type_struct.getCPtr(type), read_type);
  }

  public static int type_get_string_length(SWIGTYPE_p_coda_type_struct type, int[] length) throws nl.stcorp.coda.CodaException {
    return codacJNI.type_get_string_length(SWIGTYPE_p_coda_type_struct.getCPtr(type), length);
  }

  public static int type_get_bit_size(SWIGTYPE_p_coda_type_struct type, long[] bit_size) throws nl.stcorp.coda.CodaException {
    return codacJNI.type_get_bit_size(SWIGTYPE_p_coda_type_struct.getCPtr(type), bit_size);
  }

  public static int type_get_name(SWIGTYPE_p_coda_type_struct type, String[] name) throws nl.stcorp.coda.CodaException {
    return codacJNI.type_get_name(SWIGTYPE_p_coda_type_struct.getCPtr(type), name);
  }

  public static int type_get_description(SWIGTYPE_p_coda_type_struct type, String[] description) throws nl.stcorp.coda.CodaException {
    return codacJNI.type_get_description(SWIGTYPE_p_coda_type_struct.getCPtr(type), description);
  }

  public static int type_get_unit(SWIGTYPE_p_coda_type_struct type, String[] unit) throws nl.stcorp.coda.CodaException {
    return codacJNI.type_get_unit(SWIGTYPE_p_coda_type_struct.getCPtr(type), unit);
  }

  public static int type_get_fixed_value(SWIGTYPE_p_coda_type_struct type, String[] fixed_value, int[] length) throws nl.stcorp.coda.CodaException {
    return codacJNI.type_get_fixed_value(SWIGTYPE_p_coda_type_struct.getCPtr(type), fixed_value, length);
  }

  public static int type_get_attributes(SWIGTYPE_p_coda_type_struct type, SWIGTYPE_p_coda_type_struct attributes) throws nl.stcorp.coda.CodaException {
    return codacJNI.type_get_attributes(SWIGTYPE_p_coda_type_struct.getCPtr(type), attributes);
  }

  public static int type_get_num_record_fields(SWIGTYPE_p_coda_type_struct type, int[] num_fields) throws nl.stcorp.coda.CodaException {
    return codacJNI.type_get_num_record_fields(SWIGTYPE_p_coda_type_struct.getCPtr(type), num_fields);
  }

  public static int type_get_record_field_index_from_name(SWIGTYPE_p_coda_type_struct type, String name, int[] index) throws nl.stcorp.coda.CodaException {
    return codacJNI.type_get_record_field_index_from_name(SWIGTYPE_p_coda_type_struct.getCPtr(type), name, index);
  }

  public static int type_get_record_field_index_from_real_name(SWIGTYPE_p_coda_type_struct type, String real_name, int[] index) throws nl.stcorp.coda.CodaException {
    return codacJNI.type_get_record_field_index_from_real_name(SWIGTYPE_p_coda_type_struct.getCPtr(type), real_name, index);
  }

  public static int type_get_record_field_type(SWIGTYPE_p_coda_type_struct type, int index, SWIGTYPE_p_coda_type_struct field_type) throws nl.stcorp.coda.CodaException {
    return codacJNI.type_get_record_field_type(SWIGTYPE_p_coda_type_struct.getCPtr(type), index, field_type);
  }

  public static int type_get_record_field_name(SWIGTYPE_p_coda_type_struct type, int index, String[] name) throws nl.stcorp.coda.CodaException {
    return codacJNI.type_get_record_field_name(SWIGTYPE_p_coda_type_struct.getCPtr(type), index, name);
  }

  public static int type_get_record_field_real_name(SWIGTYPE_p_coda_type_struct type, int index, String[] real_name) throws nl.stcorp.coda.CodaException {
    return codacJNI.type_get_record_field_real_name(SWIGTYPE_p_coda_type_struct.getCPtr(type), index, real_name);
  }

  public static int type_get_record_field_hidden_status(SWIGTYPE_p_coda_type_struct type, int index, int[] hidden) throws nl.stcorp.coda.CodaException {
    return codacJNI.type_get_record_field_hidden_status(SWIGTYPE_p_coda_type_struct.getCPtr(type), index, hidden);
  }

  public static int type_get_record_field_available_status(SWIGTYPE_p_coda_type_struct type, int index, int[] available) throws nl.stcorp.coda.CodaException {
    return codacJNI.type_get_record_field_available_status(SWIGTYPE_p_coda_type_struct.getCPtr(type), index, available);
  }

  public static int type_get_record_union_status(SWIGTYPE_p_coda_type_struct type, int[] is_union) throws nl.stcorp.coda.CodaException {
    return codacJNI.type_get_record_union_status(SWIGTYPE_p_coda_type_struct.getCPtr(type), is_union);
  }

  public static int type_get_array_num_dims(SWIGTYPE_p_coda_type_struct type, int[] num_dims) throws nl.stcorp.coda.CodaException {
    return codacJNI.type_get_array_num_dims(SWIGTYPE_p_coda_type_struct.getCPtr(type), num_dims);
  }

  public static int type_get_array_dim(SWIGTYPE_p_coda_type_struct type, int[] num_dims, int[] dim) throws nl.stcorp.coda.CodaException {
    return codacJNI.type_get_array_dim(SWIGTYPE_p_coda_type_struct.getCPtr(type), num_dims, dim);
  }

  public static int type_get_array_base_type(SWIGTYPE_p_coda_type_struct type, SWIGTYPE_p_coda_type_struct base_type) throws nl.stcorp.coda.CodaException {
    return codacJNI.type_get_array_base_type(SWIGTYPE_p_coda_type_struct.getCPtr(type), base_type);
  }

  public static int type_get_special_type(SWIGTYPE_p_coda_type_struct type, int[] special_type) throws nl.stcorp.coda.CodaException {
    return codacJNI.type_get_special_type(SWIGTYPE_p_coda_type_struct.getCPtr(type), special_type);
  }

  public static int type_get_special_base_type(SWIGTYPE_p_coda_type_struct type, SWIGTYPE_p_coda_type_struct base_type) throws nl.stcorp.coda.CodaException {
    return codacJNI.type_get_special_base_type(SWIGTYPE_p_coda_type_struct.getCPtr(type), base_type);
  }

  public static int cursor_set_product(SWIGTYPE_p_coda_cursor_struct cursor, SWIGTYPE_p_coda_product_struct product) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_set_product(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), SWIGTYPE_p_coda_product_struct.getCPtr(product));
  }

  public static int cursor_goto(SWIGTYPE_p_coda_cursor_struct cursor, String path) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_goto(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), path);
  }

  public static int cursor_goto_first_record_field(SWIGTYPE_p_coda_cursor_struct cursor) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_goto_first_record_field(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor));
  }

  public static int cursor_goto_next_record_field(SWIGTYPE_p_coda_cursor_struct cursor) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_goto_next_record_field(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor));
  }

  public static int cursor_goto_record_field_by_index(SWIGTYPE_p_coda_cursor_struct cursor, int index) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_goto_record_field_by_index(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), index);
  }

  public static int cursor_goto_record_field_by_name(SWIGTYPE_p_coda_cursor_struct cursor, String name) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_goto_record_field_by_name(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), name);
  }

  public static int cursor_goto_available_union_field(SWIGTYPE_p_coda_cursor_struct cursor) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_goto_available_union_field(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor));
  }

  public static int cursor_goto_first_array_element(SWIGTYPE_p_coda_cursor_struct cursor) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_goto_first_array_element(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor));
  }

  public static int cursor_goto_next_array_element(SWIGTYPE_p_coda_cursor_struct cursor) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_goto_next_array_element(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor));
  }

  public static int cursor_goto_array_element(SWIGTYPE_p_coda_cursor_struct cursor, int num_subs, int[] subs) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_goto_array_element(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), num_subs, subs);
  }

  public static int cursor_goto_array_element_by_index(SWIGTYPE_p_coda_cursor_struct cursor, int index) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_goto_array_element_by_index(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), index);
  }

  public static int cursor_goto_attributes(SWIGTYPE_p_coda_cursor_struct cursor) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_goto_attributes(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor));
  }

  public static int cursor_goto_root(SWIGTYPE_p_coda_cursor_struct cursor) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_goto_root(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor));
  }

  public static int cursor_goto_parent(SWIGTYPE_p_coda_cursor_struct cursor) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_goto_parent(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor));
  }

  public static int cursor_use_base_type_of_special_type(SWIGTYPE_p_coda_cursor_struct cursor) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_use_base_type_of_special_type(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor));
  }

  public static int cursor_has_ascii_content(SWIGTYPE_p_coda_cursor_struct cursor, int[] has_ascii_content) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_has_ascii_content(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), has_ascii_content);
  }

  public static int cursor_has_attributes(SWIGTYPE_p_coda_cursor_struct cursor, int[] has_attributes) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_has_attributes(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), has_attributes);
  }

  public static int cursor_get_string_length(SWIGTYPE_p_coda_cursor_struct cursor, int[] length) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_get_string_length(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), length);
  }

  public static int cursor_get_bit_size(SWIGTYPE_p_coda_cursor_struct cursor, long[] bit_size) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_get_bit_size(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), bit_size);
  }

  public static int cursor_get_byte_size(SWIGTYPE_p_coda_cursor_struct cursor, long[] byte_size) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_get_byte_size(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), byte_size);
  }

  public static int cursor_get_num_elements(SWIGTYPE_p_coda_cursor_struct cursor, int[] num_elements) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_get_num_elements(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), num_elements);
  }

  public static int cursor_get_product_file(SWIGTYPE_p_coda_cursor_struct cursor, SWIGTYPE_p_coda_product_struct product) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_get_product_file(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), product);
  }

  public static int cursor_get_depth(SWIGTYPE_p_coda_cursor_struct cursor, int[] depth) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_get_depth(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), depth);
  }

  public static int cursor_get_index(SWIGTYPE_p_coda_cursor_struct cursor, int[] index) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_get_index(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), index);
  }

  public static int cursor_get_file_bit_offset(SWIGTYPE_p_coda_cursor_struct cursor, long[] bit_offset) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_get_file_bit_offset(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), bit_offset);
  }

  public static int cursor_get_file_byte_offset(SWIGTYPE_p_coda_cursor_struct cursor, long[] byte_offset) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_get_file_byte_offset(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), byte_offset);
  }

  public static int cursor_get_format(SWIGTYPE_p_coda_cursor_struct cursor, int[] format) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_get_format(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), format);
  }

  public static int cursor_get_type_class(SWIGTYPE_p_coda_cursor_struct cursor, int[] type_class) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_get_type_class(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), type_class);
  }

  public static int cursor_get_read_type(SWIGTYPE_p_coda_cursor_struct cursor, int[] read_type) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_get_read_type(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), read_type);
  }

  public static int cursor_get_special_type(SWIGTYPE_p_coda_cursor_struct cursor, int[] special_type) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_get_special_type(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), special_type);
  }

  public static int cursor_get_type(SWIGTYPE_p_coda_cursor_struct cursor, SWIGTYPE_p_coda_type_struct type) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_get_type(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), type);
  }

  public static int cursor_get_record_field_index_from_name(SWIGTYPE_p_coda_cursor_struct cursor, String name, int[] index) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_get_record_field_index_from_name(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), name, index);
  }

  public static int cursor_get_record_field_available_status(SWIGTYPE_p_coda_cursor_struct cursor, int index, int[] available) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_get_record_field_available_status(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), index, available);
  }

  public static int cursor_get_available_union_field_index(SWIGTYPE_p_coda_cursor_struct cursor, int[] index) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_get_available_union_field_index(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), index);
  }

  public static int cursor_get_array_dim(SWIGTYPE_p_coda_cursor_struct cursor, int[] num_dims, int[] dim) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_get_array_dim(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), num_dims, dim);
  }

  public static int cursor_read_int8(SWIGTYPE_p_coda_cursor_struct cursor, byte[] dst) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_read_int8(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), dst);
  }

  public static int cursor_read_uint8(SWIGTYPE_p_coda_cursor_struct cursor, byte[] dst) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_read_uint8(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), dst);
  }

  public static int cursor_read_int16(SWIGTYPE_p_coda_cursor_struct cursor, short[] dst) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_read_int16(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), dst);
  }

  public static int cursor_read_uint16(SWIGTYPE_p_coda_cursor_struct cursor, short[] dst) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_read_uint16(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), dst);
  }

  public static int cursor_read_int32(SWIGTYPE_p_coda_cursor_struct cursor, int[] dst) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_read_int32(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), dst);
  }

  public static int cursor_read_uint32(SWIGTYPE_p_coda_cursor_struct cursor, int[] dst) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_read_uint32(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), dst);
  }

  public static int cursor_read_int64(SWIGTYPE_p_coda_cursor_struct cursor, long[] dst) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_read_int64(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), dst);
  }

  public static int cursor_read_float(SWIGTYPE_p_coda_cursor_struct cursor, float[] dst) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_read_float(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), dst);
  }

  public static int cursor_read_bits(SWIGTYPE_p_coda_cursor_struct cursor, byte[] dst, long bit_offset, long bit_length) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_read_bits(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), dst, bit_offset, bit_length);
  }

  public static int cursor_read_bytes(SWIGTYPE_p_coda_cursor_struct cursor, byte[] dst, long offset, long length) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_read_bytes(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), dst, offset, length);
  }

  public static int cursor_read_int8_array(SWIGTYPE_p_coda_cursor_struct cursor, byte[] dst, ArrayOrderingEnum array_ordering) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_read_int8_array(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), dst, array_ordering.swigValue());
  }

  public static int cursor_read_uint8_array(SWIGTYPE_p_coda_cursor_struct cursor, byte[] dst, ArrayOrderingEnum array_ordering) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_read_uint8_array(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), dst, array_ordering.swigValue());
  }

  public static int cursor_read_int16_array(SWIGTYPE_p_coda_cursor_struct cursor, short[] dst, ArrayOrderingEnum array_ordering) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_read_int16_array(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), dst, array_ordering.swigValue());
  }

  public static int cursor_read_uint16_array(SWIGTYPE_p_coda_cursor_struct cursor, short[] dst, ArrayOrderingEnum array_ordering) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_read_uint16_array(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), dst, array_ordering.swigValue());
  }

  public static int cursor_read_int32_array(SWIGTYPE_p_coda_cursor_struct cursor, int[] dst, ArrayOrderingEnum array_ordering) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_read_int32_array(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), dst, array_ordering.swigValue());
  }

  public static int cursor_read_uint32_array(SWIGTYPE_p_coda_cursor_struct cursor, int[] dst, ArrayOrderingEnum array_ordering) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_read_uint32_array(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), dst, array_ordering.swigValue());
  }

  public static int cursor_read_int64_array(SWIGTYPE_p_coda_cursor_struct cursor, long[] dst, ArrayOrderingEnum array_ordering) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_read_int64_array(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), dst, array_ordering.swigValue());
  }

  public static int cursor_read_uint64_array(SWIGTYPE_p_coda_cursor_struct cursor, long[] dst, ArrayOrderingEnum array_ordering) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_read_uint64_array(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), dst, array_ordering.swigValue());
  }

  public static int cursor_read_float_array(SWIGTYPE_p_coda_cursor_struct cursor, float[] dst, ArrayOrderingEnum array_ordering) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_read_float_array(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), dst, array_ordering.swigValue());
  }

  public static int cursor_read_double_array(SWIGTYPE_p_coda_cursor_struct cursor, double[] dst, ArrayOrderingEnum array_ordering) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_read_double_array(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), dst, array_ordering.swigValue());
  }

  public static int cursor_read_complex_double_pair(SWIGTYPE_p_coda_cursor_struct cursor, double[] dst) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_read_complex_double_pair(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), dst);
  }

  public static int cursor_read_complex_double_pairs_array(SWIGTYPE_p_coda_cursor_struct cursor, double[] dst, ArrayOrderingEnum array_ordering) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_read_complex_double_pairs_array(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), dst, array_ordering.swigValue());
  }

  public static int cursor_read_complex_double_split(SWIGTYPE_p_coda_cursor_struct cursor, double[] dst_re, double[] dst_im) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_read_complex_double_split(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), dst_re, dst_im);
  }

  public static int cursor_read_complex_double_split_array(SWIGTYPE_p_coda_cursor_struct cursor, double[] dst_re, double[] dst_im, ArrayOrderingEnum array_ordering) throws nl.stcorp.coda.CodaException {
    return codacJNI.cursor_read_complex_double_split_array(SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), dst_re, dst_im, array_ordering.swigValue());
  }

  public static int expression_from_string(String exprstring, SWIGTYPE_p_coda_expression_struct expr) throws nl.stcorp.coda.CodaException {
    return codacJNI.expression_from_string(exprstring, expr);
  }

  public static int expression_get_type(SWIGTYPE_p_coda_expression_struct expr, int[] type) throws nl.stcorp.coda.CodaException {
    return codacJNI.expression_get_type(SWIGTYPE_p_coda_expression_struct.getCPtr(expr), type);
  }

  public static int expression_eval_bool(SWIGTYPE_p_coda_expression_struct expr, SWIGTYPE_p_coda_cursor_struct cursor, int[] value) throws nl.stcorp.coda.CodaException {
    return codacJNI.expression_eval_bool(SWIGTYPE_p_coda_expression_struct.getCPtr(expr), SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), value);
  }

  public static int expression_eval_integer(SWIGTYPE_p_coda_expression_struct expr, SWIGTYPE_p_coda_cursor_struct cursor, long[] value) throws nl.stcorp.coda.CodaException {
    return codacJNI.expression_eval_integer(SWIGTYPE_p_coda_expression_struct.getCPtr(expr), SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), value);
  }

  public static int expression_eval_float(SWIGTYPE_p_coda_expression_struct expr, SWIGTYPE_p_coda_cursor_struct cursor, double[] value) throws nl.stcorp.coda.CodaException {
    return codacJNI.expression_eval_float(SWIGTYPE_p_coda_expression_struct.getCPtr(expr), SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), value);
  }

  public static int expression_eval_string(SWIGTYPE_p_coda_expression_struct expr, SWIGTYPE_p_coda_cursor_struct cursor, String[] value, int[] length) throws nl.stcorp.coda.CodaException {
    return codacJNI.expression_eval_string(SWIGTYPE_p_coda_expression_struct.getCPtr(expr), SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor), value, length);
  }

  public static int expression_eval_node(SWIGTYPE_p_coda_expression_struct expr, SWIGTYPE_p_coda_cursor_struct cursor) throws nl.stcorp.coda.CodaException {
    return codacJNI.expression_eval_node(SWIGTYPE_p_coda_expression_struct.getCPtr(expr), SWIGTYPE_p_coda_cursor_struct.getCPtr(cursor));
  }

}
