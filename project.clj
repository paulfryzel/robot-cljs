(defproject robot-cljs "1.0.0-SNAPSHOT"
  :description "A CLJS-based robot experiment"
  :url "https://github.com/paulfryzel/robot-cljs"

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2234"]]

  :plugins [[lein-cljsbuild "1.0.3"]]

  :source-paths ["src"]

  :cljsbuild {
    :builds [{:id "robot-cljs"
              :source-paths ["src"]
              :compiler {
                :output-to "lib/index.js"
                :output-dir "lib/out"
                :optimizations :simple
                :source-map "lib/index.map"
                :target :nodejs}}]})
