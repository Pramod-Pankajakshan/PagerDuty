package com.to;

import java.util.*;


public class Users {

	
		 public ArrayList < User > users = new ArrayList < User > ();
		 private float limit;
		 private float offset;
		 private String total = null;
		 private boolean more;
		public float getLimit() {
			return limit;
		}
		public void setLimit(float limit) {
			this.limit = limit;
		}
		public float getOffset() {
			return offset;
		}
		public void setOffset(float offset) {
			this.offset = offset;
		}
		public boolean isMore() {
			return more;
		}
		public void setMore(boolean more) {
			this.more = more;
		}
		public String getTotal() {
			return total;
		}
		public void setTotal(String total) {
			this.total = total;
		}

}

