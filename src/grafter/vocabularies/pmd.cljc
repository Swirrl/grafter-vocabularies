(ns grafter.vocabularies.pmd
  "Some convenience terms for the Publish My Data vocabulary."
  (:require [grafter.vocabularies.core :refer [prefixer ->uri]]))

(def pmd                 (prefixer "http://publishmydata.com/def/dataset#"))

(def pmd:Dataset         (pmd "Dataset"))
(def pmd:LinkedDataset   (pmd "LinkedDataset"))
(def pmd:FileDataset     (pmd "FileDataset"))
(def pmd:DeprecatedDataset (pmd "DeprecatedDataset"))

(def pmd:contactEmail    (pmd "contactEmail"))
(def pmd:graph           (pmd "graph"))

(def pmd:fileName (pmd "fileName"))
(def pmd:fileExtension (pmd "fileExtension"))
(def pmd:mediaType (pmd "mediaType"))
(def pmd:byteSize (pmd "byteSize"))
(def pmd:downloadURL (pmd "downloadURL"))


(def folder              (prefixer "http://publishmydata.com/def/ontology/folder/"))

(def folder:Folder       (folder "Folder"))

(def folder:hasTree      (folder "hasTree"))
(def folder:defaultTree  (folder "defaultTree"))
(def folder:parentFolder (folder "parentFolder"))
(def folder:inFolder     (folder "inFolder"))
(def folder:inTree       (folder "inTree"))


(def cube (prefixer "http://publishmydata.com/def/cube/"))

(def cube:hasNumerator (cube "hasNumerator"))
(def cube:hasDenominator (cube "hasDenominator"))
(def cube:numeratorValue (cube "numeratorValue"))
(def cube:denominatorValue (cube "denominatorValue"))
(def cube:multiplierValue (cube "multiplierValue"))

(def cube:refAreaLevel (cube "refAreaLevel"))

(def pmd:hasDataMarker (->uri "http://publishmydata.com/def/hasDataMarker"))
(defn pmd:dataMarker [marker] (->uri (str "http://publishmydata.com/def/concept/data-marker/" marker)))


(def pmdont:foi (->uri "http://publishmydata.com/def/ontology/foi"))
(def foi (prefixer "http://publishmydata.com/def/ontology/foi/"))
(def foi:code (foi "code"))
(def foi:displayName (foi "displayName"))
(def foi:singularDisplayName (foi "singularDisplayName"))
(def foi:pluralDisplayName (foi "pluralDisplayName"))
(def foi:memberOf (foi "memberOf"))
(def foi:parent (foi "parent"))
(def foi:status (foi "status"))                             ;; old / deprecated
(def foi:active (foi "active"))
(def foi:within (foi "within"))
(def foi:Feature (foi "Feature"))
(def foi:FeatureCollection (foi "FeatureCollection"))
(def foi:OrgCollection (foi "OrgCollection"))
(def foi:ReferenceFeatureProperty (foi "ReferenceFeatureProperty"))

(def pmdcat (prefixer "http://publishmydata.com/pmdcat#"))
(def pmdcat:Catalog (pmdcat "Catalog"))
(def pmdcat:DatasetContents (pmdcat "DatasetContents"))
(def pmdcat:Dataset (pmdcat "Dataset"))
(def pmdcat:DataCube (pmdcat "DataCube"))
(def pmdcat:GraphDatasetContents (pmdcat "GraphDatasetContents"))
(def pmdcat:Ontology (pmdcat "Ontology"))
(def pmdcat:ConceptScheme (pmdcat "ConceptScheme"))
(def pmdcat:graph (pmdcat "graph"))
(def pmdcat:datasetContents (pmdcat "datasetContents"))
(def pmdcat:metadataGraph (pmdcat "metadataGraph"))
(def pmdcat:markdownDescription (pmdcat "markdownDescription"))

(def pmdgeo (prefixer "http://publishmydata.com/def/pmdgeo/"))
(def pmdgeo:asGeoJSON (pmdgeo "asGeoJSON"))
(def pmdgeo:geoJsonLiteral (pmdgeo "geoJsonLiteral"))
(def pmdgeo:simplificationPercent (pmdgeo "simplificationPercent"))

(def pmdkos (prefixer "http://publishmydata.com/def/pmdkos#"))
(def pmdkos:ConceptLevel (pmdkos "ConceptLevel"))
