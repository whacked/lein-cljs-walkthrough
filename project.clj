(defproject lein-cljs-walkthrough "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.228"]]
  :plugins [[lein-cljsbuild "1.1.1"]
            [lein-npm "0.6.1"]]

  :npm {:dependencies [[jquery "2.2.0"]]}
  
  :cljsbuild {:builds {:app
                       {:source-paths ["src"]
                        :compiler {:main something-something.core
                                   :output-to "hello_my_output/main_file.js"
                                   :foreign-libs [{:file "node_modules/jquery/dist/jquery.js"
                                                   :provides ["jQuery"]}]}}}}
  )
