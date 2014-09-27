(defproject pog "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.datomic/datomic-pro "0.9.4899"]
                 [me.raynes/fs "1.4.4"]
                 [org.clojure/clojurescript "0.0-2356"]]

  :repositories {"my.datomic.com" {:url "https://my.datomic.com/repo"
                                   :username "james@leanpixel.com"
                                   :password "***REMOVED***"}}
  :uberjar-name "player-of-games.jar"
  :main pog.core

  :source-paths ["src/clj" "src/cljs"]

  :profiles
  {:uberjar {:aot :all}
   :dev {:test-paths ["test/clj" "test/cljs"]
         :plugins [[quickie "0.2.5"]
                   [lein-cljsbuild "1.0.3"]
                   [com.cemerick/clojurescript.test "0.3.1"]]
         :cljsbuild {:builds [{:source-paths ["src/cljs" "test/cljs"]
                               :compiler {:output-to "target/cljs/testable.js"
                                          :optimizations :whitespace}}]
                     :test-commands {"unit-tests" ["jrunscript" "-f" "target/cljs/testable.js"
                                                   "-f" "resources/test/nashorn_runner.js"]}}}})
