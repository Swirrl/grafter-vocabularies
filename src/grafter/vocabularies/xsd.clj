(ns grafter.vocabularies.xsd
  "Some convenience terms for the XSD vocabulary."
  (:require [grafter.vocabularies.core :refer :all]))

(def xsd (prefixer "http://www.w3.org/2001/XMLSchema#"))

(def xml11-2 (prefixer "http://www.w3.org/TR/xmlschema11-2/#"))

(def xsd:boolean (xsd "boolean"))

(def xsd:byte (xsd "byte"))

(def xsd:short (xsd "short"))

(def xsd:decimal (xsd "decimal"))

(def xsd:double (xsd "double"))

(def xsd:float (xsd "float"))

(def xsd:integer (xsd "integer"))

(def xsd:int (xsd "int"))

(def xml11-2:string (xsd "string"))

(def xsd:string (xsd "string"))

(def xsd:dateTime (xsd "dateTime"))

(def xsd:dateTimeStamp (xsd "dateTimeStamp"))

(def xsd:date (xsd "date"))

(def xsd:time (xsd "time"))
