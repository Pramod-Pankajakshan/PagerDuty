package com.to;

import java.util.*;


public class Contact {

	
		 private String id;
		 private String type;
		 private String summary;
		 private String self;
		 private String html_url = null;
		 private String label;
		 private String address;
		 private boolean send_short_email;
		 private boolean send_html_email;


		 // Getter Methods 

		 public String getId() {
		  return id;
		 }

		 public String getType() {
		  return type;
		 }

		 public String getSummary() {
		  return summary;
		 }

		 public String getSelf() {
		  return self;
		 }

		 public String getHtml_url() {
		  return html_url;
		 }

		 public String getLabel() {
		  return label;
		 }

		 public String getAddress() {
		  return address;
		 }

		 public boolean getSend_short_email() {
		  return send_short_email;
		 }

		 public boolean getSend_html_email() {
		  return send_html_email;
		 }

		 // Setter Methods 

		 public void setId(String id) {
		  this.id = id;
		 }

		 public void setType(String type) {
		  this.type = type;
		 }

		 public void setSummary(String summary) {
		  this.summary = summary;
		 }

		 public void setSelf(String self) {
		  this.self = self;
		 }

		 public void setHtml_url(String html_url) {
		  this.html_url = html_url;
		 }

		 public void setLabel(String label) {
		  this.label = label;
		 }

		 public void setAddress(String address) {
		  this.address = address;
		 }

		 public void setSend_short_email(boolean send_short_email) {
		  this.send_short_email = send_short_email;
		 }

		 public void setSend_html_email(boolean send_html_email) {
		  this.send_html_email = send_html_email;
		 }
		
}

