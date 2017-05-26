(ns grafter.vocabularies.schema-org
  "URIs from schema.org"
  (:require [grafter.vocabularies.core :refer :all]))

(def schema (prefixer "http://schema.org/"))
(def schema:GovernmentOrganization (schema "GovernmentOrganization"))
(def schema:Organization (schema "Organization"))

(def schema:PostalAddress (schema "PostalAddress"))
(def schema:address (schema "address"))
(def schema:addressCounty (schema "addressCounty"))
(def schema:addressLocality (schema "addressLocality"))
(def schema:addressRegion (schema "addressRegion"))
(def schema:postalCode (schema "postalCode"))
(def schema:streetAddress (schema "streetAddress"))
(def schema:location (schema "location"))
