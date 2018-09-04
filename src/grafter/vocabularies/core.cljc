(ns grafter.vocabularies.core
  (:import #?(:clj [java.net URI])))

#?(:cljs
   (deftype URI [uri-str]
     IEquiv
     (-equiv [t o] (-equiv (.-uri-str t)
                           (.-uri-str o)))
     Object
     (toString [_]
       uri-str)

     IComparable
     (-compare [_ other]
       (compare uri-str (.-uri-str other)))

     IHash
     (-hash [_]
       (hash uri-str))

     IPrintWithWriter
     (-pr-writer [o writer _]
       (-write writer (str "#g/uri \"" uri-str "\"")))))

(defn ->uri [uri-str]
  (URI. uri-str))

(defn prefixer
  "Takes the base prefix of a URI string and returns a function that
  concatenates its argument onto the end of it e.g.
  ((prefixer \"http://example.org/\") \"foo\") ;; => \"http://example.org/foo\""
  [uri-prefix]
  (fn [value]
    (let [uri (str uri-prefix value)]
      (->uri uri))))
