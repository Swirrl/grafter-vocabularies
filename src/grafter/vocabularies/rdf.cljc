(ns grafter.vocabularies.rdf
  "Some convenience terms for the RDF and RDFS vocabularies."
  (:require [grafter.vocabularies.core :refer [prefixer]]))

(def rdf (prefixer "http://www.w3.org/1999/02/22-rdf-syntax-ns#"))
(def rdfs (prefixer "http://www.w3.org/2000/01/rdf-schema#"))

(def rdf:a "A clojure alias for rdf:type" (rdf "type"))
(def rdf:type (rdf "type"))
(def rdf:first (rdf "first"))
(def rdf:rest (rdf "rest"))

(def rdf:Property (rdf "Property"))
(def rdf:langString (rdf "langString"))

(def rdfs:subPropertyOf (rdfs "subPropertyOf"))

(def rdfs:Class (rdfs "Class"))
(def rdfs:subClassOf (rdfs "subClassOf"))

(def rdfs:label (rdfs "label"))
(def rdfs:comment (rdfs "comment"))
(def rdfs:isDefinedBy (rdfs "isDefinedBy"))
(def rdfs:range (rdfs "range"))
(def rdfs:domain (rdfs "domain"))
(def rdfs:seeAlso (rdfs "seeAlso"))
