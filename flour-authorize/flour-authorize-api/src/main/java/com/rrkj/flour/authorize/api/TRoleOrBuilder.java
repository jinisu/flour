// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AuthorizeService.proto

package com.rrkj.flour.authorize.api;

public interface TRoleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:TRole)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   */
  long getId();

  /**
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string title = 3;</code>
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 3;</code>
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>string icon = 4;</code>
   */
  java.lang.String getIcon();
  /**
   * <code>string icon = 4;</code>
   */
  com.google.protobuf.ByteString
      getIconBytes();

  /**
   * <code>string label = 5;</code>
   */
  java.lang.String getLabel();
  /**
   * <code>string label = 5;</code>
   */
  com.google.protobuf.ByteString
      getLabelBytes();

  /**
   * <code>string descr = 6;</code>
   */
  java.lang.String getDescr();
  /**
   * <code>string descr = 6;</code>
   */
  com.google.protobuf.ByteString
      getDescrBytes();

  /**
   * <code>int64 utime = 7;</code>
   */
  long getUtime();

  /**
   * <code>int64 ctime = 8;</code>
   */
  long getCtime();

  /**
   * <code>int32 status = 9;</code>
   */
  int getStatus();
}
