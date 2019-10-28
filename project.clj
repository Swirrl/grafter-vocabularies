(defproject grafter/vocabularies "0.3.2"
  :description "Vocabularies for grafting Linked-data"
  :url "http://grafter.org"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :deploy-repositories [["releases" :clojars]
                        ["snapshots" :clojars]]

  :dependencies [[org.clojure/clojure "1.9.0"]]

  :profiles {:dev {:dependencies [[org.clojure/clojurescript "1.10.339"]]}}

  :plugins [[lein-doo "0.1.10"]]

  :cljsbuild
  {:builds [{:id "test-nashorn"
             :source-paths ["src" "test"]
             :compiler {:output-to  "target/cljs/test-nashorn/test-grafter-vocabularies.js"
                        :output-dir "target/cljs/test-nashorn/out"
                        :main grafter.vocabularies.test-runner
                        :optimizations :simple
                        :process-shim false}}]}

  :aliases {"test-nashorn" ["doo" "nashorn" "test-nashorn" "once"]
            "test-all"     ["do" ["test"] ["test-nashorn"]]
            })
