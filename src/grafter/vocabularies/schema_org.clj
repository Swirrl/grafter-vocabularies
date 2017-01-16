(ns grafter.vocabularies.schema-org
  "URIs from schema.org"
  (:require [grafter.vocabularies.core :refer :all]))

(def schema (prefixer "http://schema.org/"))
(def schema:GovernmentOrganization (schema "GovernmentOrganization"))
