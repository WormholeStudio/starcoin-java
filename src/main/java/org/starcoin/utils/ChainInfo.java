package org.starcoin.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ChainInfo {


  BARNARD("barnard", "https://barnard-seed.starcoin.org", 251),
  MAIN("main", "https://main-seed.starcoin.org", 1);
  private String name;
  private String url;
  private int chainId;

}
