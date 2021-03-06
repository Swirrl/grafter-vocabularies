(ns grafter.vocabularies.qb
  "Some convenience terms for the data cube vocabulary."
  (:require [grafter.vocabularies.core :refer [prefixer]]))

(def qb (prefixer "http://purl.org/linked-data/cube#"))

(def qb:DataStructureDefinition (qb "DataStructureDefinition"))
(def qb:DataSet (qb "DataSet"))
(def qb:dataSet (qb "dataSet"))

(def qb:component (qb "component"))
(def qb:componentRequired (qb "componentRequired"))
(def qb:componentAttachment (qb "componentAttachment"))
(def qb:ComponentSpecification (qb "ComponentSpecification"))
(def qb:ComponentProperty (qb "ComponentProperty"))
(def qb:componentProperty (qb "componentProperty"))

(def qb:Attachable (qb "Attachable"))

(def qb:order (qb "order"))

(def qb:structure (qb "structure"))

(def qb:dimension (qb "dimension"))
(def qb:DimensionProperty (qb "DimensionProperty"))

(def qb:attribute (qb "attribute"))
(def qb:AttributeProperty (qb "AttributeProperty"))

(def qb:measure (qb "measure"))
(def qb:measureType (qb "measureType"))
(def qb:MeasureProperty (qb "MeasureProperty"))

(def qb:Observation (qb "Observation"))

(def qb:concept (qb "concept"))

(def qb:codeList (qb "codeList"))

(def qb:Slice (qb "Slice"))
(def qb:slice (qb "slice"))
