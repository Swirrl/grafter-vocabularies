(ns grafter.vocabularies.geosparql
  (:require [grafter.vocabularies.core :refer :all]))

(def geosparql (prefixer "http://www.opengis.net/ont/geosparql#"))

(def geosparql:Geometry (geosparql "Geometry"))
(def geosparql:hasGeometry (geosparql "hasGeometry"))
(def geosparql:asWKT (geosparql "asWKT"))
(def geosparql:wktLiteral (geosparql "wktLiteral"))
