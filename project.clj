(defproject thewarriors-path "0.2.0"
  :description "A tribute to The Warriors movie depicting the path they took through New York"
  :url "https://28.github.io/thewarriors-path/"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.9.1"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/clojurescript "1.10.520"]
                 [org.clojure/core.async  "0.4.500"]
                 [cljsjs/openlayers "4.4.1-1"]
                 [cljs-http "0.1.46"]]
  :plugins [[lein-figwheel "0.5.19"]
            [lein-cljsbuild "1.1.7" :exclusions [[org.clojure/clojure]]]]
  :source-paths ["src"]
  :cljsbuild {:builds
              [{:id "dev"
                :source-paths ["src"]
                :figwheel {:on-jsload "warriors-path.core/on-js-reload"
                           :open-urls ["http://localhost:3449/index.html"]}
                :compiler {:main thewarriors-path.core
                           :asset-path "js/compiled/out"
                           :output-to "resources/public/js/compiled/thewarriors_path.js"
                           :output-dir "resources/public/js/compiled/out"
                           :source-map-timestamp true
                           :preloads [devtools.preload]}}
               {:id "min"
                :source-paths ["src"]
                :compiler {:output-to "resources/public/js/compiled/thewarriors_path.js"
                           :main thewarriors-path.core
                           :optimizations :advanced
                           :pretty-print false
                           :closure-extra-annotations ("api" "observable")
                           :closure-warnings {:externs-validation :off}}}]}
  :figwheel {:css-dirs ["resources/public/css"]
             :server-logfile "logs/figwheel-logfile.log"
             ;; :server-logfile false
             }
  :profiles {:dev {:dependencies [[binaryage/devtools "0.9.10"]
                                  [figwheel-sidecar "0.5.19"]]
                   :source-paths ["src" "dev"]
                   :clean-targets ^{:protect false} ["resources/public/js/compiled"
                                                     :target-path]}})
