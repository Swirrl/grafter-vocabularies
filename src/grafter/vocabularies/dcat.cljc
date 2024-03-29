(ns grafter.vocabularies.dcat
  (:require [grafter.vocabularies.core :refer [prefixer]]))

(def dcat (prefixer "http://www.w3.org/ns/dcat#"))

;; Classes
(def dcat:Catalog (dcat "Catalog"))
(def dcat:CatalogRecord (dcat "CatalogRecord"))
(def dcat:Dataset (dcat "Dataset"))
(def dcat:DatasetSeries (dcat "DatasetSeries"))
(def dcat:Distribution (dcat "Distribution"))

;; Predicates

(def dcat:accessURL (dcat "accessURL"))
(def dcat:byteSize (dcat "byteSize"))
(def dcat:contactPoint (dcat "contactPoint"))
(def dcat:dataset (dcat "dataset"))
(def dcat:distribution (dcat "distribution"))
(def dcat:downloadURL (dcat "downloadURL"))
(def dcat:keyword (dcat "keyword"))
(def dcat:inSeries (dcat "inSeries"))
(def dcat:landingPage (dcat "landingPage"))
(def dcat:mediaType (dcat "mediaType"))
(def dcat:record (dcat "record"))
(def dcat:seriesMember (dcat "seriesMember"))
(def dcat:theme (dcat "theme"))
(def dcat:themeTaxonomy (dcat "themeTaxonomy"))
(def dcat:bbox (dcat "bbox"))
